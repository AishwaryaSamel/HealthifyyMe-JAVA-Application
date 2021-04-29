/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author risha
 */
public class NutritionistWorkRequest extends WorkRequest {
    
    private String dietResult;

    public String getDietResult() {
        return dietResult;
    }

    public void setDietResult(String testResult) {
        this.dietResult = testResult;
    }
}
