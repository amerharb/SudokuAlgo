/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokualgo;

/**
 *
 * @author Amer
 */
import java.util.Scanner;

class CommandReader extends Thread
{

    protected boolean hasCommand = false;
    private String value;

    @Override
    public void run()
    {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                value = in.nextLine();
                hasCommand = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getCommand()
    {
        hasCommand = false;
        return value;
    }

}
