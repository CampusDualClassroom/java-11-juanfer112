package com.campusdual.classroom;

public class TVRemote {
    int channel;
    int volume;
    boolean on;
    private final String color;

    /**
     * Constructor para inicializar un control remoto con un color específico.
     * El canal y volumen inicializan en 0.
     *
     * @param color Color del control remoto.
     */
    public TVRemote(String color){
        this.channel = 0;
        this.volume = 0;
        this.color = color;
    }

    /**
     * Enciende la TV.
     *
     * @return Estado actual de la TV (encendida).
     */
    public boolean turnOn() {
        this.on =  true;
        return this.on;
    }

    /**
     * Apaga la TV.
     *
     * @return Estado actual de la TV (apagada).
     */
    public boolean turnOff() {
        this.on =  false;
        return this.on;
    }

    /**
     * Aumenta el canal en 1.
     */
    public void channelUp() {
        this.channel++;
    }

    /**
     * Disminuye el canal en 1 si el canal actual es mayor a 0.
     */
    public void channelDown() {
        if(checkMinValue(this.channel)) {
            this.channel--;
        }
    }

    /**
     * Aumenta el volumen en 1.
     */
    public void volumeUp() {
        this.volume++;
    }

    /**
     * Disminuye el volumen en 1 si el volumen actual es mayor a 0.
     */
    public void volumeDown() {
        if(checkMinValue(this.volume)) {
            this.volume--;
        }
    }
    /**
     * Obtiene el color del control remoto.
     *
     * @return El color del control remoto.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Verifica si un valor está por encima del mínimo permitido (0).
     *
     * @param value Valor a verificar.
     * @return Verdadero si el valor es mayor que 0, falso en caso contrario.
     */
    private boolean checkMinValue(int value) {
        return value > 0;
    }
}
