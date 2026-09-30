
public static void main(String[] args) {

    String text = "J@va the be$t!123";
    char[] chars = text.toCharArray();   // ['J','a','v','a',' ','t','h','e',' ','b','e','$','t','!','1','2','3'] — массив символов

    int left = 0;
    int right = chars.length - 1;

    while (left < right) {

        if (!Character.isLetter(chars[left])) {
            left++;
            continue;
        }
        if (!Character.isLetter(chars[right])) {
                right--;
                continue;
        }

        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;

        left++;
        right--;

    }

    System.out.println(new String(chars));  //

}