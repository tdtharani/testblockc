package com.myblockchain.model;

import com.myblockchain.utils.BlockChainUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TransactionOutput {
    private String Id;
    private String[] recipient;
    private float amount;
    private String parentTransId;
    private long timestamp;

    public TransactionOutput(String[] recipient, float amount, String parentTransId) {
        this.Id = BlockChainUtils.generateTransactionId();
        this.recipient = recipient;
        this.amount = amount;
        this.parentTransId = parentTransId;
        this.timestamp = new Date().getTime();
    }

    public String getId(){
        return Id;
    }

    public String[] getRecipient(){
        return recipient;
    }

    public float getAmount(){
        return amount;
    }

//    /**
//     * Determine whether a person owns this amount of money
//     * @param publicKey
//     * @return boolean
//     */
//    public boolean isMine(PublicKey publicKey) {
//        return publicKey == recipient;
//    }
}
