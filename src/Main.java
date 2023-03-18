
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        boolean rodando = true;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pacientes> pacientes = new ArrayList<>();

        while (rodando) {

            System.out.println("              OdontoMais            ");
            System.out.println("        Cadastro de Pacientes!");
            System.out.println(" ");
            System.out.println("(01) - Cadastrar novo paciente.");
            System.out.println("(02) - Pesquisar Paciente.");
            System.out.println("(03) - Pesquisar ficha do paciente.");
            System.out.println("(04) - Fechar. ");
            System.out.println("----------------------------------------");
            System.out.print("Digite a opção: ");
            int opc = scanner.nextInt();
            System.out.println("----------------------------------------");

            switch (opc) {
                case 1:
                    System.out.println("          Cadastrando novo paciente!      ");
                    System.out.println(" ");
                    System.out.print("Nome do paciente: ");
                    Scanner user004 = new Scanner(System.in);
                    String user000 = user004.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Cpf: ");
                    int Cpf = scanner.nextInt();
                    System.out.println(" ");
                    System.out.println("----------------------------------------");
                    System.out.println("  Cadastro realizado com sucesso!");

                    Pacientes a = new Pacientes();
                    a.setNome(user000);
                    a.setIdade(idade);
                    a.setCpf(Cpf);

                    pacientes.add(a);

                    break;
                case 2:
                    System.out.println("     Pesquisar Paciente! ");
                    System.out.println(" ");
                    System.out.println("Digite o nome do paciente:  ");
                    Scanner user001 = new Scanner(System.in);
                    String user002 = user001.nextLine();
                      boolean encontrado = false;
                    for (int i = 0; i < pacientes.size(); i++) {
                        Pacientes lista = pacientes.get(i);
                        if (user002.equals(lista.getNome())) {

                            System.out.println("Nome: " + lista.getNome());
                            System.out.println("Idade: " + lista.getIdade());
                            System.out.println("Cpf: " + lista.getCpf());
                            encontrado = true;
                            break;}
                        }
                        if (encontrado == false){
                                    System.out.println("Usuário não encontrado!");
                        }
                        System.out.print("----------------------------------------");
                        System.out.println(" ");
                        System.out.println("    Ficha Completa do paciente");
                        System.out.println(" ");
                        break;


                        case 3: {

                        }

                        case 4:
                            rodando = false;
                            System.out.println("Fechando!");
                        default:
                    }
            }

        }

    }
