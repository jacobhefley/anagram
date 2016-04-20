import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Random;
import java.lang.String;
import spark.ModelAndView;
import static java.lang.System.out;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/winner", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/winner.vtl");

      String sentence = request.queryParams("sentence");
      Boolean winner = checkWinner(sentence);

      model.put("winner", winner);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static boolean checkWinner(String sentence) {
    String answer = sentence;
    Random rad = new Random();

    HashMap<Integer, String> maps = new HashMap<Integer, String>();
      maps.put(0, "r");
      maps.put(1, "p");
      maps.put(2, "s");
    System.out.println(rad.nextInt(3));

    String randomPlayer = maps.get(rad.nextInt(3));
    System.out.println(randomPlayer);

    boolean returnValue = false;

    switch(answer){
      case "r": 
        if(randomPlayer=="s"){
          returnValue = true;
        }
        break;
      case "p":
        if(randomPlayer=="r"){
          returnValue = true;
        }
        break;
      case "s":
        if(randomPlayer=="p"){
          returnValue = true;
        }
        break;
    }
    return returnValue;
  }
}
