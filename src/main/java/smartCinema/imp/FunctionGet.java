package smartCinema.imp;

import org.apache.ibatis.io.Resources;
import com.fasterxml.jackson.databind.ObjectMapper;
import smartCinema.core.IFunctionGet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lupeidong on 16/7/12.
 */
public class FunctionGet implements IFunctionGet {

    public void functionGet()throws IOException{
        /**
         *get json file
         */
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(Resources.class.getResource("/conf/functionHandle.json").getFile());
        Scanner sc = new Scanner(System.in);
        /**
         * select your role
         */
        Map<String,List<String>> roles = mapper.readValue(file,Map.class);
        System.out.println("select your role:");
        for(String role :roles.get("roles")){
            System.out.print(" "+role+",");
        }
        System.out.println();
        String role = sc.nextLine();
        while (!roles.get("roles").contains(role)){
            System.out.println("not a role. please select again");
            role = sc.next();
        }

        /**
         * select your module
         */
        Map<String,Map<String,List<String>>> modules = mapper.readValue(file,Map.class);
        System.out.println("select your module:");
        for(String module : modules.get(role).get("modules")){
            System.out.print(" "+module+",");
        }
        System.out.println();
        String module = sc.nextLine();
        while (!modules.get(role).get("modules").contains(module)){
            System.out.println("not a module. please select again");
            module = sc.next();
        }

        /**
         * select your function
         */
        Map<String,Map<String,Map<String,List<String>>>> functions = mapper.readValue(file,Map.class);
        System.out.println("select your function:");
        for (String function : functions.get(role).get(module).get("functions")){
            System.out.print(" "+function+",");
        }
        System.out.println();
        String function = sc.nextLine();
        while (!functions.get(role).get(module).get("functions").contains(function)){
            System.out.println("not a function. please select again");
            function = sc.next();
        }

        /**
         * implement the function
         */
        System.out.println("you choose: "+function+", now we will implement it!");


        FunctionImpl.functionImpl(module,function);





    }
}
