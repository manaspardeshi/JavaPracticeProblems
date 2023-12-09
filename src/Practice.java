public class Practice {

    public void swapVariables1(int var1, int var2) {
        int temp=var2;
        var2=var1;
        var1=temp;
        System.out.println("var1:"+var1+" var2:"+var2);
    }

    public void swapVariables2(int var1, int var2){
        var1=var1-var2;
        var2=var1+var2;
        var1=var2-var1;
        System.out.println("var1:"+var1+" var2:"+var2);
    }

    public void swapVariables3(int var1, int var2){
        var1=var1^var2;
        var2=var1^var2;
        var1=var1^var2;
        System.out.println("var1:"+var1+" var2:"+var2);
    }

    public void swapVariables4(int var1, int var2){
        var1=(var1+var2)-(var1=var2);
        System.out.println("var1:"+var1+" var2:"+var2);
    }

}
