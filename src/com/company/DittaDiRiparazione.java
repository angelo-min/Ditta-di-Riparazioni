package com.company;

public class DittaDiRiparazione {
        private Tecnico[] tecnici;
        private Riparazione[] riparazioni;
        static private int nRiparazioni = 0;

        public void addRiparazione(Riparazione r){
            riparazioni[nRiparazioni] = r;
            nRiparazioni++;
        }

        public Riparazione[] getRiparazioni(){
            return riparazioni;
        }

        public Riparazione maxPriority(){
            if(nRiparazioni > 0){
                int maxPriority = 0;
                int index = 0;
                for(int i = 0; i < nRiparazioni; i++){
                    if(maxPriority < riparazioni[i].getPriority()){
                        maxPriority = riparazioni[i].getPriority();
                        index = i;
                    }
                }
                return riparazioni[index];
            }
            return riparazioni[0];
        }

        public void assignRiparazione(Riparazione r, Tecnico t){
            t.riparazione = r;
        }

        public static class Tecnico {
            private String name;
            private Riparazione riparazione;

            public Tecnico(String name) {
                this.name = name;
            }


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class Riparazione {
            private String address;
            private int priority;

            public Riparazione(String address, int priority) {
                this.address = address;
                this.priority = priority;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }
        }

}
