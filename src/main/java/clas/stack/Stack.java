package clas.stack;

/**
 * Created by Vlad on 25.01.2016.
 */
public class Stack {
    int stck[] = new int[10];

    int tos;

    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos==9)
            System.out.println("Stack full.");
        else
            stck[++tos] = item;
    }
    int pop(){
        if(tos < 0){
            System.out.println("Stack not loaded.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
