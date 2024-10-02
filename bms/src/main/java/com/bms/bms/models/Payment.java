package com.bms.bms.models;
import com.bms.bms.models.enums.PaymentStatus;
import com.bms.bms.models.enums.PaymentMethodType;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name="city")for changing the table name
public class Payment extends BaseModel{
      private String reference;
      private Double amount;

      @Enumerated
      private PaymentMethodType providerType;

      @Enumerated
      private PaymentStatus paymentStatus;

}
