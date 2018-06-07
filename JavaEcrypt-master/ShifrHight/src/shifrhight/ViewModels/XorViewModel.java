/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shifrhight.ViewModels;

import shifrhight.Models.XorEncryptor;

/**
 *
 * @author volgin
 */
public class XorViewModel extends ViewModelBase {

    private String text, key, result;
    private final XorEncryptor model;

    public String getResult() {
        return result;
    }

    public String getText() {
        return text;
    }

    public String getKey() {
        return key;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public void setKey(String newKey) {
        this.key = newKey;
    }

    private void setResult(String newResult) {
        this.result = newResult;
        onPropertyChanged("result");
    }

    public XorViewModel(XorEncryptor model) {
        this.model = model;
    }

    public void Encrypt() {
        String textInput = getText();
        if (textInput.equals("")) {
            onErrorOccured("Вы не ввели данные");
        } else {
            String s = text;
            for (byte b : s.getBytes()) {
            text=String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')+text;   
            }
            String k=key;
            for (byte b : k.getBytes()) {
            key=String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')+key;                
            }
            setResult(model.encrypt(text, key));
        }
    }
}
