package gitlet;

import static gitlet.Utils.*;


/** Driver class for Gitlet, a subset of the Git version-control system.
 *  @author TODO
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND1> <OPERAND2> ... 
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            exitWithError("Please enter a command.");
        }
        String firstArg = args[0];
        switch(firstArg) {
            case "init":
                // TODO: handle the `init` command
                Repository.handleInit();
                break;
            case "status":
                // TODO: handle the `status` command
                Repository.handleStatus();
                break;
            case "add":
                validateNumArgs("add", args, 2);
                String fileName = args[1];
                Repository.handleAdd(fileName);
                break;
            case "commit":
                // TODO: handle the `commit [filename]` command
                validateMessage(args);
                String msg = args[1];
                Repository.handleCommit(msg);
                break;
            case "checkout":
                Repository.handleCheckout(args);
                break;
            case "log":
                // TODO: handle the `log` command
                Repository.handleLog();
                break;
            default:
//                exitWithError(String.format("Unknown command: %s", args[0]));
                exitWithError("No command with that name exists.");
        }
    }

}
