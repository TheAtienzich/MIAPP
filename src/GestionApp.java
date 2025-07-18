import java.util.*;
import java.io.*;

public class GestionApp {
    String ActiveUser;
    enum MenuOptions { Salir, Crear, Pendiente, Hoy}
    public String getUser(){
        String name = null;
        BufferedReader fileName = null;

        try{
            fileName = new BufferedReader(new FileReader(new File("user.txt")));
            name = fileName.readLine();
        }

        catch (IOException fileError) {
            System.err.println("Error 001: File Not Found");
        }

        finally{
            try{ fileName.close();} catch (Exception e) {}
        }

        return name;
    }

    public String setUser(){
        PrintWriter setUser = null;
        Scanner sc = new Scanner(System.in);
        String name = null;

        try{
            setUser = new PrintWriter("user.txt");
            System.out.println("¿What is your name?");
            setUser.println(sc.nextLine());
        }

        catch (IOException fileError) {
            System.err.println("Error 002: Writing File Error");
        }

        finally{
            try{ setUser.close();} catch (Exception e) {}
        }

        return name;
    }

    public void Bienvenida(){
        ActiveUser = getUser();

        if(ActiveUser == null){
            ActiveUser = setUser();
        }

        System.out.println("¡Welcome " + ActiveUser + "!");
    }
}
