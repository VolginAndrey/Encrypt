/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shifrhight.ViewModels;

import common.NotifyPropertyChangedBase;
import shifrhight.Models.BlockEncryptor;

/**
 *
 * @author KL
 */
public class BlockViewModel extends NotifyPropertyChangedBase {

    private String text, key,kBLock, result;
    private final BlockEncryptor model;

    public String getResult() {
        return result;
    }

    public String getText() {
        return text;
    }

    public String getKey() {
        return key;
    }
    public String getBlock() {
        return kBLock;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public void setKey(String newKey) {
        this.key = newKey;
    }
    public void setBlock(String newkBlock) {
        this.kBLock = newkBlock;
    }

    private void setResult(String newResult) {
        this.result = newResult;
        onPropertyChanged("result");
    }

    public BlockViewModel(BlockEncryptor model) {
        this.model = model;
    }

    public void Encrypt() {
        setResult(model.encrypt(text, key, kBLock));
    }
}
