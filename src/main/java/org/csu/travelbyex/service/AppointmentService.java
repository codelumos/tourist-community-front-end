package org.csu.travelbyex.service;

import org.csu.travelbyex.domain.Appointment;
import org.csu.travelbyex.domain.AppointmentParticipant;
import org.csu.travelbyex.domain.AppointmentReply;

import java.util.List;

public interface AppointmentService {

    //约
    public void insertAppointment(Appointment appointment);

    public void deleteAppointment(Integer appointmentId);

    public List getAllAppointments();

    public List getAppointmentsByAuthorId(String authorId);

    public List getAppointmentsBySpotId(Integer spotId);

    public void updateAppointmentById(Appointment appointment);

    //回复
    public void insertAppointmentReply(AppointmentReply appointmentReply);

    public List getAppointmentReplysByAppointmentId(Integer appointmentId);

    //队友信息
    public void insertAppointmentParticipant(AppointmentParticipant appointmentParticipant);

    public List getAppointmentParticipantsByAppointmentId(Integer appointmentId);
}