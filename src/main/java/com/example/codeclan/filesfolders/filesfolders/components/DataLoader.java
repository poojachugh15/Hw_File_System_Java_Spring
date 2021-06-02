package com.example.codeclan.filesfolders.filesfolders.components;

import com.example.codeclan.filesfolders.filesfolders.models.File;
import com.example.codeclan.filesfolders.filesfolders.models.Folder;
import com.example.codeclan.filesfolders.filesfolders.models.User;
import com.example.codeclan.filesfolders.filesfolders.repositories.FileRepository;
import com.example.codeclan.filesfolders.filesfolders.repositories.FolderRepository;
import com.example.codeclan.filesfolders.filesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }


    public void run(ApplicationArguments args) {
        User donna = new User("Donna");
        userRepository.save(donna);

        User craig = new User("Craig");
        userRepository.save(craig);


        Folder visa_documents = new Folder("Visa Documents", donna);
        folderRepository.save(visa_documents);

        Folder homeWork = new Folder("Homework", craig);
        folderRepository.save(homeWork);


        File maths = new File("Maths", ".txt", 10, homeWork);
        fileRepository.save(maths);

        File spouse_visa = new File("Spouse documents", ".txt", 5, visa_documents);
        fileRepository.save(spouse_visa);


    }


}
