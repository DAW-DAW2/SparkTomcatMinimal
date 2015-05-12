package daw.daw.spark;

import static spark.Spark.*;
import spark.servlet.SparkApplication;
public class Sparks implements spark.servlet.SparkApplication{
    public void init() {
        get("/test", (req, res) -> "OK, success!");          
    }    
}
