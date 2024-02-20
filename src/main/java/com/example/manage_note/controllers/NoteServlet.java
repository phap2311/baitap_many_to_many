package com.example.manage_note.controllers;

import com.example.manage_note.models.Note;
import com.example.manage_note.service.INoteService;
import com.example.manage_note.service.NoteService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NoteServlet" , urlPatterns = "/notes")
public class NoteServlet extends HttpServlet {
    INoteService iNoteService = new NoteService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                //showCreateNote(req,resp);
                break;
            case "edit":
                //showEditNote(req,resp);
                break;
            case "delete":
                //deleteNote(req,resp);
                break;
            default:
                showListNote(req,resp);
                break;
        }
        
    }

    private void showListNote(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/notes/list.jsp");
        List<Note>noteList = iNoteService.findAll();
        req.setAttribute("notes",noteList);
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                //showCreateNote(req,resp);
                break;
            case "edit":
                //showEditNote(req,resp);
                break;
            case "delete":
                //deleteNote(req,resp);
                break;
            default:
                showListNote(req,resp);
                break;
        }
    }
}
