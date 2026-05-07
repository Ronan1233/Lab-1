void main() {
    System.out.println(getans(100));
}
public static int getans(int input){
    int i = 0;
    while (input>0){
        if (input % 2 == 0){
            input = input / 2;
        }else {
            input = input - 1;
        }
        i ++;
    }
    return i;
}