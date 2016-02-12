import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      String inputString = request.queryParams("inputWord");
      String puzzleOut = vowelsToDashes(inputString);

      model.put("inputWord", inputString);
      model.put("outputWord", puzzleOut);
      return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());


      }

        public static String vowelsToDashes (String sentence) {

        sentence = sentence.replaceAll("(?i)a", "-");
        sentence = sentence.replaceAll("(?i)e", "-");
        sentence = sentence.replaceAll("(?i)i", "-");
        sentence = sentence.replaceAll("(?i)o", "-");
        sentence = sentence.replaceAll("(?i)u", "-");

       return sentence;



    }
}
