package com.scenarios.scenario1;

import java.util.Arrays;
import java.util.List;

public class HighBudgetProject {

    public static void main(String[] args) {
        Project p1 = new Project("Healthcare", 50000);
        Project p2 = new Project("Banking", 120000);
        Project p3 = new Project("Retail", 30000);

        Client c1 = new Client("Alice", Arrays.asList(p1, p2));
        Client c2 = new Client("Bob", Arrays.asList(p3));
        Client c3 = new Client("Charlie", Arrays.asList(p2));

        List<Client> clients = Arrays.asList(c1, c2, c3);

        List<String> result = findEmployeesWithHighBudgetProjects(clients, 100000);
        result.forEach(System.out::println);
    }


    /* The company wants to identify employees who are working on projects with budgets higher than a certain threshold (e.g., ₹1,00,000).
       This helps in resource allocation, performance tracking, and prioritizing high‑value projects. */
    private static List<String> findEmployeesWithHighBudgetProjects(List<Client> clients, int maxBudget) {
        return clients.stream()
                .filter(client -> client.getProjects().stream()
                        .anyMatch(proj -> proj.getBudget() >  maxBudget)
                )
                .map(Client::getName)
                .toList();
    }
}
