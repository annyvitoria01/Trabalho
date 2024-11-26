import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            int cont=0;
            Scanner scanner = new Scanner(System.in);

            Questao q1 = new Questao();
            q1.pergunta = "1) Em qual filme da Disney vemos pela primeira vez o personagem Simba?";
            q1.opcaoA = "A) A Bela e a Fera";
            q1.opcaoB = "B) O Rei Leão";
            q1.opcaoC = "C) Aladdin";
            q1.opcaoD = "D) Pocahontas";
            q1.opcaoE = "E) Mulan";
            q1.correta = "B";

            q1.escrevaQuestao();
            String resposta1 = q1.leiaResposta();
            if (q1.isCorreta(resposta1.trim())) {
                cont++;
            }

            //proxima questao

            Questao q2 = new Questao();
            q2.pergunta = "2) Qual é o nome do brinquedo cowboy no filme Toy Story?";
            q2.opcaoA = "A) Buzz Lightyear";
            q2.opcaoB = "B) Slinky";
            q2.opcaoC = "C) Woody";
            q2.opcaoD = "D) Rex";
            q2.opcaoE = "E) Mr. Potato Head";
            q2.correta = "C";

            q2.escrevaQuestao();
            String resposta2 = q2.leiaResposta();
            if (q2.isCorreta(resposta2.trim())) {
                cont++;
            }

            //proxima questao

            Questao q3 = new Questao();
            q3.pergunta = "3) Qual é o nome do vilão em A Pequena Sereia?";
            q3.opcaoA = "A) Jafar";
            q3.opcaoB = "B) Scar";
            q3.opcaoC = "C) Malévola";
            q3.opcaoD = "D) Úrsula";
            q3.opcaoE = "E) Hades";
            q3.correta = "D";

            q3.escrevaQuestao();
            String resposta3 = q3.leiaResposta();
            if (q3.isCorreta(resposta3.trim())) {
                cont++;
            }

            //proxima questao

            Questao q4 = new Questao();
            q4.pergunta = "4) Qual é o animal de estimação da princesa Jasmine em Aladdin?";
            q4.opcaoA = "A) Um macaco";
            q4.opcaoB = "B) Um papagaio";
            q4.opcaoC = "C) Um leão";
            q4.opcaoD = "D) Um tigre";
            q4.opcaoE = "E) Um cavalo";
            q4.correta = "D";

            q4.escrevaQuestao();
            String resposta4 = q4.leiaResposta();
            if (q4.isCorreta(resposta4.trim())) {
                cont++;
            }

            //proxima questao

            Questao q5 = new Questao();
            q5.pergunta = "5) Em Frozen, qual é o nome da irmã de Elsa?";
            q5.opcaoA = "A) Anna";
            q5.opcaoB = "B) Ariel";
            q5.opcaoC = "C) Rapunzel";
            q5.opcaoD = "D) Bela";
            q5.opcaoE = "E) Tiana";
            q5.correta = "A";

            q5.escrevaQuestao();
            String resposta5 = q5.leiaResposta();
            if (q5.isCorreta(resposta5.trim())) {
                cont++;
            }

            //proxima questao

            Questao q6 = new Questao();
            q6.pergunta = "6) Em Procurando Nemo, qual é o nome da peixe que tem perda de memória recente?";
            q6.opcaoA = "A) Dory";
            q6.opcaoB = "B) Marlin";
            q6.opcaoC = "C) Crush";
            q6.opcaoD = "D) Bruce";
            q6.opcaoE = "E) Squirt";
            q6.correta = "A";

            q6.escrevaQuestao();
            String resposta6 = q6.leiaResposta();
            if (q6.isCorreta(resposta6.trim())) {
                cont++;
            }

            //proxima quetao

            Questao q7 = new Questao();
            q7.pergunta = "7) Qual é o nome do ratinho chefe em Ratatouille?";
            q7.opcaoA = "A) Linguini";
            q7.opcaoB = "B) Remy";
            q7.opcaoC = "C) Gusteau";
            q7.opcaoD = "D) Alfredo";
            q7.opcaoE = "E) Emile";
            q7.correta = "B";

            q7.escrevaQuestao();
            String resposta7 = q7.leiaResposta();
            if (q7.isCorreta(resposta7.trim())) {
                cont++;
            };

            //PROXIMA QUESTAO

            Questao q8 = new Questao();
            q8.pergunta = "8) Quem ajuda a Cinderela a ir ao baile?";
            q8.opcaoA = "A) As irmãs más";
            q8.opcaoB = "B) A madrasta";
            q8.opcaoC = "C) O príncipe";
            q8.opcaoD = "D) A Fada Madrinha";
            q8.opcaoE = "E) Os ratos";
            q8.correta = "D";

            q8.escrevaQuestao();
            String resposta8 = q8.leiaResposta();
            if (q8.isCorreta(resposta8.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q9 = new Questao();
            q9.pergunta = "9) Qual é o nome do dragão em Mulan?";
            q9.opcaoA = "A) Smaug";
            q9.opcaoB = "B) Mushu";
            q9.opcaoC = "C) Elliot";
            q9.opcaoD = "D) Falcor";
            q9.opcaoE = "E) Shenron";
            q9.correta = "B";

            q9.escrevaQuestao();
            String resposta9 = q9.leiaResposta();
            if (q9.isCorreta(resposta9.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q10 = new Questao();
            q10.pergunta = "10) Qual é o nome da princesa no filme A Bela Adormecida?";
            q10.opcaoA = "A) Bela";
            q10.opcaoB = "B) Cinderela";
            q10.opcaoC = "C) Aurora";
            q10.opcaoD = "D) Branca de Neve";
            q10.opcaoE = "E) Jasmine";
            q10.correta = "C";

            q10.escrevaQuestao();
            String resposta10 = q10.leiaResposta();
            if (q10.isCorreta(resposta10.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q11 = new Questao();
            q11.pergunta = "11) Em Aladdin, o que o gênio da lâmpada oferece a Aladdin?";
            q11.opcaoA = "A) Três desejos";
            q11.opcaoB = "B) Um castelo";
            q11.opcaoC = "C) Um novo traje";
            q11.opcaoD = "D) A liberdade";
            q11.opcaoE = "E) Riquezas";
            q11.correta = "A";


            q11.escrevaQuestao();
            String resposta11 = q11.leiaResposta();
            if (q11.isCorreta(resposta11.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q12 = new Questao();
            q12.pergunta = "12) Qual é o nome da princesa que dorme por 100 anos em A Bela Adormecida?";
            q12.opcaoA = "A) Rapunzel";
            q12.opcaoB = "B) Ariel";
            q12.opcaoC = "C) Aurora";
            q12.opcaoD = "D) Cinderela";
            q12.opcaoE = "E) Bela";
            q12.correta = "C";

            q12.escrevaQuestao();
            String resposta12 = q12.leiaResposta();
            if (q12.isCorreta(resposta12.trim())) {
                cont++;
            }
            //PROXIMA QUESTAO

            Questao q13 = new Questao();
            q13.pergunta = "13) Em Monstros S.A., qual é o nome do personagem principal?";
            q13.opcaoA = "A) Mike";
            q13.opcaoB = "B) Sulley";
            q13.opcaoC = "C) Randall";
            q13.opcaoD = "D) Boo";
            q13.opcaoE = "E) Waternoose";
            q13.correta = "B";

            q13.escrevaQuestao();
            String resposta13 = q13.leiaResposta();
            if (q13.isCorreta(resposta13.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q14 = new Questao();
            q14.pergunta = "14) Em Hércules, quem é o mentor de Hércules?";
            q14.opcaoA = "A) Zeus";
            q14.opcaoB = "B) Hades";
            q14.opcaoC = "C) Filoctetes";
            q14.opcaoD = "D) Atena";
            q14.opcaoE = "E) Héracles";
            q14.correta = "C";

            q14.escrevaQuestao();
            String resposta14 = q14.leiaResposta();
            if (q14.isCorreta(resposta14.trim())) {
                cont++;
            }

            //PROXIMA QUESTAO

            Questao q15 = new Questao();
            q15.pergunta = "15) Em Zootopia, qual é o nome da coelha policial?";
            q15.opcaoA = "A) Judy Hopps";
            q15.opcaoB = "B) Dory";
            q15.opcaoC = "C) Elsa";
            q15.opcaoD = "D) Anna";
            q15.opcaoE = "E) Bellwether";
            q15.correta = "A";

            q15.escrevaQuestao();
            String resposta15 = q15.leiaResposta();
            if (q15.isCorreta(resposta15.trim())) {
                cont++;
            }

            double porcetagem= ((double)cont / 15.0) * 100;
            System.out.println("voce acertou "+ String.format("%.2f", porcetagem) +  "%");
            System.out.println("Você acertou "  +cont+ " De 15 questões");









        }
    }