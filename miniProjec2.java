import java.util.Scanner;
public class miniProjec2 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);

        System.out.println("Selamat Datang di Tempat Penukaran Uang");
        System.out.println("==============================");
        //user input jumlah yang yang ingin ditukarkan
        System.out.print("Silahkan Masukkan Jumlah Uang yang ingin Ditukarkan: ");
        int inputMoney1 = money.nextInt();
        System.out.println("==============================");

        System.out.println("1. 50.000");
        System.out.println("2. 20.000");
        System.out.println("3. 10.000");
        System.out.println("4. 5.000");
        System.out.println("5. 2.000");
        System.out.println("6. 1.000");
        System.out.print("Masukkan besar pecahan yang diinginkan: ");
        int inputBanknotes = money.nextInt();

        if (inputBanknotes == 1) {
            System.out.println("==============================");
            int ops1 = inputMoney1 / 50000;
            int mod1 = inputMoney1 % 50000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int ops2 = mod1 / 20000;
                int mod2 = mod1 % 20000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int ops3 = mod2 / 10000;
                    int mod3 = mod2 % 10000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int ops4 = mod3 / 5000;
                        int mod4 = mod3 % 5000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int ops5 = mod4 / 2000;
                            int mod5 = mod4 % 2000;
                            if (mod5 != 0) {
                                int ops6 = mod5 / 1000;
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 50.000 " + ops1 + " lembar");
                                    System.out.println("Rp 20.000 " + ops2 + " lembar");
                                    System.out.println("Rp 10.000 " + ops3 + " lembar");
                                    System.out.println("Rp 5.000 " + ops4 + " lembar");
                                    System.out.println("Rp 2.000 " + ops5 + " lembar");
                                    System.out.println("Rp 1.000 " + ops6 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 50.000 " + ops1 + " lembar");
                                    System.out.println("Rp 20.000 " + ops2 + " lembar");
                                    System.out.println("Rp 10.000 " + ops3 + " lembar");
                                    System.out.println("Rp 5.000 " + ops4 + " lembar");
                                    System.out.println("Rp 2.000 " + ops5 + " lembar");
                                    System.out.println("Rp 1.000 " + ops6 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 50.000 " + ops1 + " lembar");
                                System.out.println("Rp 20.000 " + ops2 + " lembar");
                                System.out.println("Rp 10.000 " + ops3 + " lembar");
                                System.out.println("Rp 5.000 " + ops4 + " lembar");
                                System.out.println("Rp 2.000 " + ops5 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 50.000 " + ops1 + " lembar");
                            System.out.println("Rp 20.000 " + ops2 + " lembar");
                            System.out.println("Rp 10.000 " + ops3 + " lembar");
                            System.out.println("Rp 5.000 " + ops4 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 50.000 " + ops1 + " lembar");
                        System.out.println("Rp 20.000 " + ops2 + " lembar");
                        System.out.println("Rp 10.000 " + ops3 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 50.000 " + ops1 + " lembar");
                    System.out.println("Rp 20.000 " + ops2 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 50.000 " + ops1 + " lembar");
            }
        } else if (inputBanknotes == 2) {
            int ops1 = inputMoney1 / 20000;
            int mod1 = inputMoney1 % 20000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int ops2 = mod1 / 10000;
                int mod2 = mod1 % 10000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int ops3 = mod2 / 5000;
                    int mod3 = mod2 % 5000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int ops4 = mod3 / 2000;
                        int mod4 = mod3 % 2000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int ops5 = mod4 / 1000;
                            int mod5 = mod4 % 1000;
                            if (mod5 != 0) {
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 20.000 " + ops1 + " lembar");
                                    System.out.println("Rp 10.000 " + ops2 + " lembar");
                                    System.out.println("Rp 5.000 " + ops3 + " lembar");
                                    System.out.println("Rp 2.000 " + ops4 + " lembar");
                                    System.out.println("Rp 1.000 " + ops5 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 20.000 " + ops1 + " lembar");
                                    System.out.println("Rp 10.000 " + ops2 + " lembar");
                                    System.out.println("Rp 5.000 " + ops3 + " lembar");
                                    System.out.println("Rp 2.000 " + ops4 + " lembar");
                                    System.out.println("Rp 1.000 " + ops5 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 20.000 " + ops1 + " lembar");
                                System.out.println("Rp 10.000 " + ops2 + " lembar");
                                System.out.println("Rp 5.000 " + ops3 + " lembar");
                                System.out.println("Rp 2.000 " + ops4 + " lembar");
                                System.out.println("Rp 1.000 " + ops5 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 10.000 " + ops1 + " lembar");
                            System.out.println("Rp 10.000 " + ops2 + " lembar");
                            System.out.println("Rp 5.000 " + ops3 + " lembar");
                            System.out.println("Rp 2.000 " + ops4 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 20.000 " + ops1 + " lembar");
                        System.out.println("Rp 10.000 " + ops2 + " lembar");
                        System.out.println("Rp 5.000 " + ops3 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 20.000 " + ops1 + " lembar");
                    System.out.println("Rp 10.000 " + ops2 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 20.000 " + ops1 + " lembar");
            }
        } else if (inputBanknotes == 3) {
            int ops1 = inputMoney1 / 10000;
            int mod1 = inputMoney1 % 10000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int ops2 = mod1 / 5000;
                int mod2 = mod1 % 5000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int ops3 = mod2 / 2000;
                    int mod3 = mod2 % 2000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int ops4 = mod3 / 1000;
                        int mod4 = mod3 % 1000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int mod5 = mod4 % 1000;
                            if (mod5 != 0) {
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 10.000 " + ops1 + " lembar");
                                    System.out.println("Rp 5.000 " + ops2 + " lembar");
                                    System.out.println("Rp 2.000 " + ops3 + " lembar");
                                    System.out.println("Rp 1.000 " + ops4 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 10.000 " + ops1 + " lembar");
                                    System.out.println("Rp 5.000 " + ops2 + " lembar");
                                    System.out.println("Rp 2.000 " + ops3 + " lembar");
                                    System.out.println("Rp 1.000 " + ops4 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 10.000 " + ops1 + " lembar");
                                System.out.println("Rp 5.000 " + ops2 + " lembar");
                                System.out.println("Rp 2.000 " + ops3 + " lembar");
                                System.out.println("Rp 1.000 " + ops4 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 10.000 " + ops1 + " lembar");
                            System.out.println("Rp 5.000 " + ops2 + " lembar");
                            System.out.println("Rp 2.000 " + ops3 + " lembar");
                            System.out.println("Rp 1.000 " + ops4 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 10.000 " + ops1 + " lembar");
                        System.out.println("Rp 5.000 " + ops2 + " lembar");
                        System.out.println("Rp 2.000 " + ops3 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 10.000 " + ops1 + " lembar");
                    System.out.println("Rp 5.000 " + ops2 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 10.000 " + ops1 + " lembar");
            }
        } else if (inputBanknotes == 4) {
            int ops1 = inputMoney1 / 5000;
            int mod1 = inputMoney1 % 5000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int ops2 = mod1 / 2000;
                int mod2 = mod1 % 2000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int ops3 = mod2 / 1000;
                    int mod3 = mod2 % 1000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int mod4 = mod3 % 1000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int mod5 = mod4 % 1000;
                            if (mod5 != 0) {
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 5.000 " + ops1 + " lembar");
                                    System.out.println("Rp 2.000 " + ops2 + " lembar");
                                    System.out.println("Rp 1.000 " + ops3 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 5.000 " + ops1 + " lembar");
                                    System.out.println("Rp 2.000 " + ops2 + " lembar");
                                    System.out.println("Rp 1.000 " + ops3 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 5.000 " + ops1 + " lembar");
                                System.out.println("Rp 2.000 " + ops2 + " lembar");
                                System.out.println("Rp 1.000 " + ops3 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 5.000 " + ops1 + " lembar");
                            System.out.println("Rp 2.000 " + ops2 + " lembar");
                            System.out.println("Rp 1.000 " + ops3 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 5.000 " + ops1 + " lembar");
                        System.out.println("Rp 2.000 " + ops2 + " lembar");
                        System.out.println("Rp 1.000 " + ops3 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 5.000 " + ops1 + " lembar");
                    System.out.println("Rp 2.000 " + ops2 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 5.000 " + ops1 + " lembar");
            }
        } else if (inputBanknotes == 5) {
            int ops1 = inputMoney1 / 2000;
            int mod1 = inputMoney1 % 2000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int ops2 = mod1 / 1000;
                int mod2 = mod1 % 1000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int mod3 = mod2 % 1000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int mod4 = mod3 % 1000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int mod5 = mod4 % 1000;
                            if (mod5 != 0) {
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 2.000 " + ops1 + " lembar");
                                    System.out.println("Rp 1.000 " + ops2 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 2.000 " + ops1 + " lembar");
                                    System.out.println("Rp 1.000 " + ops2 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 2.000 " + ops1 + " lembar");
                                System.out.println("Rp 1.000 " + ops2 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 2.000 " + ops1 + " lembar");
                            System.out.println("Rp 1.000 " + ops2 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 2.000 " + ops1 + " lembar");
                        System.out.println("Rp 1.000 " + ops2 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 2.000 " + ops1 + " lembar");
                    System.out.println("Rp 1.000 " + ops2 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 2.000 " + ops1 + " lembar");
            }
        } else if (inputBanknotes == 6) {
            int ops1 = inputMoney1 / 1000;
            int mod1 = inputMoney1 % 1000;
            if (mod1 != 0) {
                System.out.println("Uang Anda Sisa: " + mod1);
                System.out.println("==============================");
                int mod2 = mod1 % 1000;
                if (mod2 != 0) {
                    System.out.println("Uang Anda Sisa: " + mod2);
                    System.out.println("==============================");
                    int mod3 = mod2 % 1000;
                    if (mod3 != 0) {
                        System.out.println("Uang Anda Sisa: " + mod3);
                        System.out.println("==============================");
                        int mod4 = mod3 % 1000;
                        if (mod4 != 0) {
                            System.out.println("Uang Anda Sisa: " + mod4);
                            System.out.println("==============================");
                            int mod5 = mod4 % 1000;
                            if (mod5 != 0) {
                                int mod6 = mod5 % 1000;
                                if (mod6 != 0) {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 1.000 " + ops1 + " lembar");
                                } else {
                                    System.out.println("==============================");
                                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                    System.out.println("Rp 1.000 " + ops1 + " lembar");
                                }
                            } else {
                                System.out.println("==============================");
                                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                                System.out.println("Rp 1.000 " + ops1 + " lembar");
                            }
                        } else {
                            System.out.println("==============================");
                            System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                            System.out.println("Rp 1.000 " + ops1 + " lembar");
                        }
                    } else {
                        System.out.println("==============================");
                        System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                        System.out.println("Rp 1.000 " + ops1 + " lembar");
                    }
                } else {
                    System.out.println("==============================");
                    System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                    System.out.println("Rp 1.000 " + ops1 + " lembar");
                }
            } else {
                System.out.println("==============================");
                System.out.println("Anda Berhasil Menukarkan Berjumlah: ");
                System.out.println("Rp 1.000 " + ops1 + " lembar");
            }
        } else {
            System.out.println("==============================");
            System.out.println("Maaf Pilihan Anda Tidak Ada");
        }
    }
}


