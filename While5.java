class While5 {
  public static void main(String[] args) {
    int a[] = {10, 3, -1, 5, 20};
    int i = 0;
    do {
        if (a[i] < 0) {
            System.out.print("i=" + i + " でループを抜ける");
            System.out.println(" a[" + i + "]: " + a[i]);
            break;
        }
        System.out.println("i=" + i + " の処理");
        ++i;
    } while (i < 5);
  }
}
