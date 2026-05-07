void main() {
    System.out.println(getans(1000));
}
public static int getans(int input){
    int i = 0;
    for (int i2 = 1; i2 < input; i2 ++){
        if (i2 % 3 == 0 || i2 % 5 == 0){
            i ++;
        }
    }
    return i;
}