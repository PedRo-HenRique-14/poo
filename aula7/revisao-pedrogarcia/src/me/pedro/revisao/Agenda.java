package me.pedro.revisao;

public class Agenda {
    private static int totalRegisteredPeople = 0;
    private Person[] registry = new Person[10];

    public void addPerson(Person person) {
        if (totalRegisteredPeople == 10) {
            System.out.println("\nA lista está cheia!");
            return;
        }
        registry[totalRegisteredPeople++] = person;
    }

    public void removePerson(String name) {

        // Remove a pessoa com o nome informado no parametro, e reorganiza o array
        for(int i = 0; i < registry.length; i++){
            if(registry[i] == null){
                break;
            }

            if(registry[i].getName().equals(name)) {
                for(int j = i; j < registry.length; j++) {
                    if(j + 1 == registry.length) {
                        registry[registry.length - 1] = null;
                        continue;
                    }
                    registry[j] = registry[j + 1];
                }
            }
            System.out.println("\nPessoa deletada!");
        }
    }

    public void searchPerson(String name) {
        for(int i = 0; i < registry.length; i++) {
            if(registry[i] == null) {
                break;
            }

            if(registry[i].getName().equals(name)) {
                System.out.printf("\nExiste um registro com esse nome no index [%s]\n", i);
            }
        }
    }

    public void printRegistry() {
        for(Person person : registry) {
            if (person == null) {
                break;
            }
            System.out.println("\n-------------------------------");
            System.out.printf("Nome: %s\nIdade: %s\nAltura: %s\nData de nascimento: %s\n", 
                person.getName(), 
                person.getAge(), 
                person.getHeight(), 
                person.getDateOfBirth()
            );
            System.out.println("-------------------------------");
        }
    }
    
    public void printPerson(int i) {
        Person person = registry[i];
        
        System.out.println("\n-------------------------------");
        System.out.printf("Nome: %s\nIdade: %s\nAltura: %s\nData de nascimento: %s\n", 
        person.getName(), 
        person.getAge(), 
        person.getHeight(), 
        person.getDateOfBirth()
        );
        System.out.println("-------------------------------");
    }
}
