package me.pedro.revisao;

import java.util.Scanner;

import me.pedro.revisao.television.RemoteControl;
import me.pedro.revisao.television.Television;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opt;
        
        do {
            System.out.println("\n----------MENU----------");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Atividade 1 e 2");
            System.out.println("[2] Atividade 3");
            System.out.println("[3] Atividade 4");
            System.out.println("[4] Sair");
            System.out.print("\n>> ");
            opt = scanner.nextInt();
            
            switch (opt) {
                case 1:
                    peoplesAndRegistry(scanner);
                    break;

                case 2:
                    elevator(scanner);
                    break;

                case 3:
                    televisionAndRemoteControl(scanner);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();      
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opt != 4); 
        
    }

    private static void peoplesAndRegistry(Scanner scanner) {
        Agenda agenda = new Agenda();
        int opt;

        System.out.println("\nAtividade 1 e 2");

        do {

            System.out.println("\n----------MENU----------");
            System.out.println("[1] Adicionar pessoa");
            System.out.println("[2] Remover pessoa");
            System.out.println("[3] Procurar pessoa");
            System.out.println("[4] Imprimir agenda");
            System.out.println("[5] Imprimir pessoa");
            System.out.println("[6] Voltar");
            System.out.print("\n>> ");
            opt = scanner.nextInt();
            
            switch (opt) {
                case 1:
                    Person person = new Person();
                    System.out.printf("Informe o nome da pessoa\n>> ");
                    person.setName(scanner.next());
                    System.out.printf("Informe a data de nascimento (dd-MM-yyyy)\n>> ");
                    person.setDateOfBirth(scanner.next());
                    System.out.printf("Informe a altura da pessoa (cm)\n>> ");
                    person.setHeight(scanner.nextInt());

                    agenda.addPerson(person);

                    System.out.println("\nPessoa adicionada com sucesso!");
                    scanner.nextLine();
                    break;

                case 2:
                    String nameToDelete;
                    System.out.print("Informe o nome da pessoa para deletar\n\n>> ");
                    nameToDelete = scanner.next();
                    
                    agenda.removePerson(nameToDelete);
                    break;

                case 3:
                    String nameToSearch;
                    System.out.print("Informe o nome da pessoa para procurar\n\n>> ");
                    nameToSearch = scanner.next();

                    agenda.searchPerson(nameToSearch);
                    break;

                case 4:
                    agenda.printRegistry();
                    break;

                case 5:
                    int personIndex;
                    System.out.print("Informe o index da pessoa\n>> ");
                    personIndex = scanner.nextInt();

                    agenda.printPerson(personIndex);
                    break;

                case 6:
                    System.out.println("\nVoltando ao menu principal...");
                    break;
            
                default:
                    System.out.println("");
                    break;
            }

        } while (opt != 6);

    }

    private static void elevator(Scanner scanner) {
        Elevator elevator = new Elevator();
        int opt;

        System.out.println("\nAtividade 3 (elevador)");

        do {
            
            System.out.println("\n----------MENU----------");
            System.out.println("[1] Inicializar elevador");
            System.out.println("[2] Adicionar uma pessoa");
            System.out.println("[3] Remover uma pessoa");
            System.out.println("[4] Subir um andar");
            System.out.println("[5] Descer um andar");
            System.out.println("[6] Ver informações do elevador");
            System.out.println("[7] Voltar");
            System.out.print("\n>> ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    int maxCapacity;
                    int totalFloors;
                    System.out.print("Informe a capacidade máxima do elevador\n>> ");
                    maxCapacity = scanner.nextInt();
                    System.out.print("Informe o total de andares do prédio\n>> ");
                    totalFloors = scanner.nextInt();
                    elevator.init(maxCapacity, totalFloors);
                    System.out.println("\nElevador inicializado!");
                    break;

                case 2:
                    if (!elevator.peopleEnters()) {
                        System.out.println("\nCapacidade máxima atingida!");
                        break;
                    }
                    System.out.printf("\nUma pessoa entrou no elevador [%s/%s]\n", 
                        elevator.getCurrentNumberOfPeople(), 
                        elevator.getMaxCapacity()
                    );
                    break;

                case 3:
                    if(!elevator.personLeaves()) {
                        System.out.println("\nO elevador está vazio!");
                        break;
                    }
                    System.out.printf("\nUma pessoa saiu do elevador [%s/%s]\n", 
                        elevator.getCurrentNumberOfPeople(), 
                        elevator.getMaxCapacity()
                    );
                    break;

                case 4:
                    if (!elevator.goUp()) {
                        System.out.println("\nO elevador já está no ultimo andar!");
                        break;
                    }
                    System.out.printf("\nO elevador subiu um andar [%s/%s]\n", 
                        elevator.getCurrentFloor(), 
                        elevator.getTotalNumberOfFloors()
                    );
                    break;

                case 5:
                    if (!elevator.goDown()) {
                        System.out.println("\nO elevador já está no térreo");
                        break;
                    }
                    System.out.printf("\nO elevador desceu um andar [%s/%s]\n", 
                        elevator.getCurrentFloor(), 
                        elevator.getTotalNumberOfFloors()
                    );
                    break;

                case 6:
                    System.out.printf("\nNumero de pessoas: %s/%s\n", 
                        elevator.getCurrentNumberOfPeople(), 
                        elevator.getMaxCapacity()
                    );
                    System.out.printf("Andar atual: %s/%s", 
                        elevator.getCurrentFloor(),
                        elevator.getTotalNumberOfFloors()
                    );
                    break;

                case 7:
                    System.out.println("\nVoltando para o menu principal...");
                    break;
            
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        } while (opt != 7);
    }

    private static void televisionAndRemoteControl(Scanner scanner) {
        Television television = new Television();
        RemoteControl remoteControl = television.getRemoteControl();
        int opt;

        System.out.println("\nAtividade 4 (televisão)");

        do {
            
            System.out.println("\n----------MENU----------");
            System.out.println("[1] Escolher canal");
            System.out.println("[2] Aumentar canal");
            System.out.println("[3] Diminuir canal");
            System.out.println("[4] Aumentar volume");
            System.out.println("[5] Diminuir volume");
            System.out.println("[6] Voltar");
            System.out.print("\n>> ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.printf("Informe o canal que desejas (%s - %s)\n>> ",
                        television.getMinLimitOfChannels(),
                        television.getMaxLimitOfChannels()    
                    );
                    if (!remoteControl.setChannel(scanner.nextInt())) {
                        System.out.println("\nO canal selecionado é inválido!");
                        break;
                    }
                    System.out.printf("\nO canal foi mudado para %s\n", television.getCurrentChannel());
                    break;

                case 2:
                    if (!remoteControl.increaseChannel()) {
                        System.out.println("\nVocê já está no ultimo canal!");
                        break;
                    }
                    System.out.printf("\nO canal foi mudado para %s\n", television.getCurrentChannel());
                    break;

                case 3:
                    if(!remoteControl.decreaseChannel()) {
                        System.out.println("\nVocê já está no primeiro canal!");
                        break;
                    }
                    System.out.printf("\nO canal foi mudado para %s\n", television.getCurrentChannel());
                    break;

                case 4:
                    if(!remoteControl.increaseVolume()) {
                        System.out.println("\nVocê já está no volume máximo!");
                        break;
                    }
                    System.out.printf("\nVolume aumentado %s\n", television.getCurrentVolume());
                    break;

                case 5:
                    if(!remoteControl.decreaseVolume()) {
                        System.out.println("\nA televisão está silenciada!");
                        break;
                    }
                    System.out.printf("\nVolume diminuido %s", television.getCurrentVolume());
                    break;

                case 6:
                    System.out.println("\nVoltando para o menu principal...");
                    break;
            
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        } while (opt != 6);

    }
}