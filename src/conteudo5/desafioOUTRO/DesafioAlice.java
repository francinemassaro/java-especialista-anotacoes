package conteudo5.desafioOUTRO;

public class DesafioAlice {

    public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int x = i + 1; x < nums.length; x++) {
                    if (nums[i] + nums[x] == target) {
                        System.out.println("Posição da soma dos números que dão valor de target: " + i + " "+ x);
                        return new int[]{i, x};
                    }
                }
            }
            System.out.println("Não encontrado soma de números compatível com target na lista enviada.");
            return new int[]{};
        }
    }

