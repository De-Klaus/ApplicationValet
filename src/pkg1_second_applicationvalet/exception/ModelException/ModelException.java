/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.exception.ModelException;

/**
 *
 * @author Omen
 */
public class ModelException extends Exception {   

    public static final int CODE_EMPTY = 1;
    public static final int CURRENCY_EMPTY = 2;
    public static final int ACCOUNT_EMPTY = 3;
    public static final int RATE_INCORRECT = 4;
    
    private final int code;
    
    public ModelException(int code) {
        this.code = code;
    }
    
    @Override
    public String getMessage() {
        switch (code) {
            case CODE_EMPTY:
                return "ERROR_CURRENCY_EMPTY";
            case CURRENCY_EMPTY:
                return "ERROR_CURRENCY_EMPTY";
            case ACCOUNT_EMPTY:
                return "ERROR_ACCOUNT_EMPTY";
            case RATE_INCORRECT:
                return "ERROR_RATE_INCORRECT";
        }
        return "";
    }
    
}