
public static void main(String[] args) {

    String s = "J@va the be$t!123";
    int n = s.length();        // '17'
    char c = s.charAt(0);      // 'J'

    Character.isLetter('a');   // true
    Character.isLetter('7');   // false
    Character.isLetter('@');   // false
    Character.isLetter(' ');   // false

    char[] chars = s.toCharArray();   // ['J','a','v','a',' ','t','h','e',' ','b','e','$','t','!','1','2','3'] — массив символов
// ... меняем нужные элементы массива ...
    String result = new String(chars);   // массив символов → строка
//----------------------------------------------------------------------------------------------------------------------

    int left = 0;
    int right = chars.length - 1;

    while (left < right) {

        if (!Character.isLetter(chars[left])) {
            left++;
            continue;
        }

                 // меняем местами края
            if (Character.isLetter(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     // сдвигаем указатели навстречу
                right--;
            } else {
                right--;
            }

    }

    System.out.println(new String(chars));  //

}