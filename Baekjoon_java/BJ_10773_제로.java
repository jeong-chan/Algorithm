public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int command = Integer.parseInt(br.readLine());
            if(command != 0){
                stack.push(command);
                continue;
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }else{
            int ans = 0;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                ans += stack.pop();
            }

            System.out.println(ans);
            return;
        }

    }

}

import sun.awt.image.IntegerComponentRaster;

import javax.management.QueryEval;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int command = Integer.parseInt(br.readLine());
            if(command != 0){
                stack.push(command);
                continue;
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }else{
            int ans = 0;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                ans += stack.pop();
            }

            System.out.println(ans);
            return;
        }

    }

}

