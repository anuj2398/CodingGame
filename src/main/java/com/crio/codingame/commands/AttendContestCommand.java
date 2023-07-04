package com.crio.codingame.commands;

import java.util.List;

import com.crio.codingame.dtos.UserRegistrationDto;
import com.crio.codingame.exceptions.UserNotFoundException;
import com.crio.codingame.services.IUserService;

public class AttendContestCommand implements ICommand{

    private final IUserService userService;
    
    public AttendContestCommand(IUserService userService) {
        this.userService = userService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute attendContest method of IUserService and print the result.
    // Also Handle Exceptions and print the error messsages if any.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["ATTEND_CONTEST","3","Joey"]
    // Hint - Use Parameterized Exceptions in the Service class to match with the Unit Tests Output.

    @Override
    public void execute(List<String> tokens) {
        try{
            UserRegistrationDto userdto = userService.attendContest(tokens.get(1), tokens.get(2));
            if(!userdto.getUserName().equals(tokens.get(2)))
            throw new UserNotFoundException("Cannot Attend Contest. User for given name:"+ tokens.get(2)+" not found!");
            System.out.println(userdto);
           
        }
        catch (Exception e){
        System.out.println(e.getMessage());
        }
    }
    
}
