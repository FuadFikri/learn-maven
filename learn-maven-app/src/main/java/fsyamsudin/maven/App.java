package fsyamsudin.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Hello World!" );

        Student fikri = new Student("Fikri",22);
        Gson gson = new Gson();
        String json = gson.toJson(fikri);
        System.out.println(json);
    }
}
