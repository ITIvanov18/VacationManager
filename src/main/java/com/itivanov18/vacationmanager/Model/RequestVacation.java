package com.itivanov18.vacationmanager.Model;

import javax.persistence.*;
import java.sql.Date;


    @Entity
    @Table
    public class RequestVacation {

        @Id
        @GeneratedValue
        private int id;
        @Column
        private String dateFrom;
        @Column
        private String dateTo;
        @Column(columnDefinition="DATE")
        private Date creationDate;
        @Column
        private boolean halfDayVacation;
        @Column
        private boolean approved = false;
        @Column
        private int userId;

        public RequestVacation(int id, String dateFrom, String dateTo, Date creationDate, boolean halfDayVacation, boolean approved, int userId) {
            this.id = id;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.creationDate = creationDate;
            this.halfDayVacation = halfDayVacation;
            this.approved = approved;
            this.userId = userId;
        }

        public RequestVacation(String dateFrom, String dateTo, Date creationDate, boolean halfDayVacation, boolean approved, int userId) {
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.creationDate = creationDate;
            this.halfDayVacation = halfDayVacation;
            this.approved = approved;
            this.userId = userId;
        }

        public RequestVacation() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDateFrom() {
            return dateFrom;
        }

        public void setDateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
        }

        public String getDateTo() {
            return dateTo;
        }

        public void setDateTo(String dateTo) {
            this.dateTo = dateTo;
        }

        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        public boolean isHalfDayVacation() {
            return halfDayVacation;
        }

        public void setHalfDayVacation(boolean halfDayVacation) {
            this.halfDayVacation = halfDayVacation;
        }

        public boolean isApproved() {
            return approved;
        }

        public void setApproved(boolean approved) {
            this.approved = approved;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }

