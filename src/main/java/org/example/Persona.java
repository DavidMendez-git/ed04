package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de números de teléfono.
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor que crea un nuevo contacto con un nombre y un número de teléfono inicial.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono inicial del contacto.
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de teléfono asociados al contacto.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
