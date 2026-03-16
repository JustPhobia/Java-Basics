package Module2.TaskManagerExercise;

import java.util.ArrayList;



public class TaskManager implements MenuSelection {
    private ArrayList<Task> tasks;
    private UtilClass util;

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void viewTasks() {
        System.out.println("=================[T A S K S]==========================\n");
        printTasks();
        System.out.println("======================================================");
    }
    private char correctTask(int index) {
        System.out.println("Is this the correct task [Y/N]:\n[" + tasks.get(index).toString() + "]");
        return util.getInputCharYesNo();
    }

    private char selectNewTask() {
        System.out.println("Would you like to select another task? [Y/N]");
        return util.getInputCharYesNo();
    }

    @Override
    public void removeTask() {
    }
    private void printTasks() {
        int counter = 1;
        for (Task task : tasks) {
            System.out.print(counter + ": " + task.toString());
            counter++;
        }
    }

    @Override
    public void updateTask() {
        boolean done = false;
        System.out.println("=================UPDATE=================");
        while (!done) {
            System.out.println("What task would you like to update?");
            printTasks();
            int index = util.getIndexInt(tasks.size());
            if (correctTask(index) == 'y') {
                updateMenu();
                index = util.getIndexInt(4);

            } else {
                if (selectNewTask() == 'n') {
                    break;
                }else{
                    done=true;
                }
            }
        }
    }

    private void updateMenu() {
        boolean done = false;
        System.out.println("-------------------------------" +
                "/nWhat would you like to update?" +
                "\n1: Title" +
                "\n2: Description" +
                "\n3: Priority" +
                "\n4: Due date" +
                "--------------------------------");
    }

    private void updateFunction(int indexMenu, int indexTask) {
        switch (indexMenu){
            case 1:
                System.out.println("Please eneter a new title: ");
                String title = util.getInputString("\\D");
                tasks.get(indexTask).setTitle(title);
        }
    }
    @Override
    public void markComplete() {
        System.out.println("============COMPLETED============");
        System.out.println("Which task would you like to mark complete?");
        printTasks();
        int index = util.getIndexInt(tasks.size());
        if (correctTask(index) == 'y') {
            Task task = tasks.get(index);
            task.setStatus(true);
        } else {

        }
    }

}
