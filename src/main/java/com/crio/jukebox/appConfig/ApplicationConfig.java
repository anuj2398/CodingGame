package com.crio.jukebox.appConfig;

import com.crio.jukebox.commands.CommandInvoker;
import com.crio.jukebox.commands.CreateUserCommand;
import com.crio.jukebox.repositories.IUserRepository;
import com.crio.jukebox.repositories.UserRepository;
import com.crio.jukebox.services.IUserService;
import com.crio.jukebox.services.UserService;

public class ApplicationConfig {

    //All Repositories
    private final IUserRepository userRepository = new UserRepository();

    //All Services
    private final IUserService userService = new UserService(userRepository);

    //All Commands
    private final CreateUserCommand createUserCommand = new CreateUserCommand(userService);

    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE_USER",createUserCommand);
        // commandInvoker.register("CREATE_QUESTION",createQuestionCommand);
        // commandInvoker.register("LIST_QUESTION",listQuestionCommand);
        // commandInvoker.register("CREATE_CONTEST",createContestCommand);
        // commandInvoker.register("LIST_CONTEST",listContestCommand);
        // commandInvoker.register("ATTEND_CONTEST",attendContestCommand);
        // commandInvoker.register("RUN_CONTEST",runContestCommand);
        // commandInvoker.register("LEADERBOARD",leaderBoardCommand);
        // commandInvoker.register("WITHDRAW_CONTEST",withdrawContestCommand);
        return commandInvoker;
    }
}
