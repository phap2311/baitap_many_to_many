package com.example.manage_note.controllers;

import com.example.manage_note.models.DTONoCa;
import com.example.manage_note.models.NoteCategory;
import com.example.manage_note.service.INoteCategoryService;
import com.example.manage_note.service.NoteCategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NoteCategoryServlet", urlPatterns = "/noteCategory")
public class NoteCategoryServlet extends HttpServlet {
    INoteCategoryService iNoteCategoryService = new NoteCategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
switch (action){
    case "create":
        showCreateNoCa(req,resp);
        break;
    default:
        showListNoCa(req,resp);
        break;
}
    }

    private void showCreateNoCa(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/noteCategory/create.jsp");

    }

    private void showListNoCa(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/noteCategory/listdto.jsp");
        List<DTONoCa> dtoNoCaList = iNoteCategoryService.findAll();
        req.setAttribute("dtoNoCaList",dtoNoCaList);
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

    }
}
