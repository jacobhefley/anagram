import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Random;
import java.lang.String;
import java.util.Arrays;
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


    get("/encrypted", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/encrypted.vtl");

      String sentence = request.queryParams("sentence");
      String puzzle = makePuzzle(sentence);

      model.put("puzzle", puzzle);
      model.put("sentence", sentence);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String makePuzzle(String input) {
    String userInput= input; // create instance of input variable to manipulate and return
    String vowels[] = {"A","E","I","O","U","a","e","i","o","u"}; // array of all vowels

    //iterate through the user inputed string and replaceAll voweles using the vowels array
    // for(int i=0; i<userInput.length;i++){
    //   userInput.replaceAll(vowels[i]);
    // }
userInput.replace('a','-');
    return userInput;
  }
}
