
public static void main(String[] args) {

    String s = "Java";
    int n = s.length();        // 4
    char c = s.charAt(0);      // 'J'

    Character.isLetter('a');   // true
    Character.isLetter('7');   // false
    Character.isLetter('@');   // false
    Character.isLetter(' ');   // false

    char[] chars = s.toCharArray();   // ['J','a','v','a'] — массив символов
// ... меняем нужные элементы массива ...
    String result = new String(chars);   // массив символов → строка
//----------------------------------------------------------------------------------------------------------------------

    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
        char tmp = chars[left];     // меняем местами края
        chars[left] = chars[right];
        chars[right] = tmp;
        left++;                     // сдвигаем указатели навстречу
        right--;
    }

    System.out.println(new String(chars));  // "avaJ"



}