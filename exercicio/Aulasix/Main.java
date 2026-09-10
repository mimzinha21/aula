package exercicio.Aulasix;

public class Main {
    public class Main  {
        public static void main (String[] args) {
            int[][] numeros= { 
                {1, 4, 2, 8}, 
                {3, 6, 8, 9},
              {4, 7, 5, 3},
              {9, 2, 1, 3}
            };
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    System.out.println(numeros[i][j]);
                }
            }
        }
    }
}

  