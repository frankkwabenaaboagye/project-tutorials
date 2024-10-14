package com.frankaboagye.connecthub.entities;
//
//import com.frankaboagye.connecthub.enums.ApplicationStatus;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//
///**
// * The ProjectApplication entity represents an application submitted by a freelancer
// * for a specific project. It contains details about the application status, associated
// * freelancer, company, and project.
// */
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
public class ProjectApplication {
//
//    /**
//     * The unique ID of the project application.
//     * Auto-generated by the database.
//     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    /**
//     * The location of the resume submitted by the freelancer.
//     * This could be a URL or file path to the resume document.
//     */
//    private String resumeLocation;
//
//    /**
//     * The date when the application was submitted.
//     */
//    private LocalDate applicationDate;
//
//    /**
//     * The current status of the application.
//     * This is stored as a string in the database (e.g., "SUBMITTED", "ACCEPTED").
//     */
//    @Enumerated(EnumType.STRING)
//    private ApplicationStatus status;
//
//    /**
//     * The freelancer who submitted the application.
//     * This establishes a many-to-one relationship with the Freelancer entity.
//     */
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "freelancer_id")
//    private Freelancer freelancer;
//
//    /**
//     * The company associated with the project.
//     * This establishes a many-to-one relationship with the Company entity.
//     */
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "company_id")
//    private Company company;
//
//    /**
//     * The project for which the application is submitted.
//     * This establishes a many-to-one relationship with the Project entity.
//     */
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "project_id")
//    private Project project;
//
//    /**
//     * Any additional comments or notes from the freelancer regarding the application.
//     * This field allows freelancers to add context or information relevant to their application.
//     */
//    private String freelancerComment;
//
}
