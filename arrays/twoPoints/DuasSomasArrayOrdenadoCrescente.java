public class DuasSomasArrayOrdenadoCrescente {

    // dois ponteiros só funciona para arrays ordenados crescente
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };

        int entrada = 9;
        int left = 0;
        int rigth = nums.length - 1;

        while (left <= rigth) {
            int soma = nums[left] + nums[rigth];
            if (soma == entrada) {
                System.out.print("[" + left + "]" + "[" + rigth + "]");
                break;
            } else if (soma < entrada) {
                left++;
            } else {
                rigth--;
            }
        }
        // retorno no LeetCode
        // return new int[] { left, rigth };
    }
}
