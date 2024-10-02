package com.bms.bms.models;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @CreatedDate
      @Temporal(TemporalType.TIMESTAMP)
      private Date createdAt;


      @LastModifiedDate
      @Temporal(TemporalType.TIMESTAMP)
      private Date updatedAt;
}
