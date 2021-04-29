/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author aishwaryasamel
 */
public class PhysioWorkRequest extends WorkRequest{
    private String physioResult;

    public String getPhysioResult() {
        return physioResult;
    }

    public void setPhysioResult(String physioResult) {
        this.physioResult = physioResult;
    }
    
    
}
