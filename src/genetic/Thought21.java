package genetic;
import java.util.ArrayList;
class Thought21 extends Thought{
private static ArrayList<Thought21> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 806.9386474205422;
private double fd1 = 751.2191884086353;
private Thought fo0 = null;
private Thought fo1 = null;
Thought21 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought21 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought21 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Output.points[5][2] -= fd0;
        fd1 *= -1;
if(fo0 != null){
          lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Output.points[5][3] -= fd0;
        fb1 = lb0 && fb0;
        boolean lb1 = true;
        double ld2 = 763.7003490292069;
        fb0 = fb1 || lb0;
        boolean lb3 = false;
        lb1 = !lb3;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
        }

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[5][4] -= fd1;
    boolean lb3 = true;
if(fo0 != null){
      lb3 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb6 = false;
    boolean lb7 = true;
    Thought lo8 = Thought94.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, lb4, lb5);
}
    Thought lo9 = Thought94.getInstance(fo1, fo0, fo1, fo0, lb6, lb7, ab1, ab2);
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    Thought lo10 = Thought77.getInstance();
    boolean lb11 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb2, lb3, lb4, lb5);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    if (ab1) {
        if (ab2) {
            ab3 = ab4 || fb0;
            fb1 = ab1 && ab2;
            fd0 = fd1 - ad1;
            ab3 = ad2 < ad3;
            ad4 *= -1;
            Thought lo0 = Thought96.getInstance(ab4, fb0, fb1, ab1);
            ab2 = ab3 && ab4;
if(fo0 != null){
              fd0 = fo0.m3();
}
if(fo0 != null){
              fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
            double ld1 = 559.5121599937801;
            ad3 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            boolean lb2 = false;
            double ld3 = 931.1669087267502;
            boolean lb4 = true;
            ab1 = ab2 || ab3;
            ad3 = ad4 + fd0;
            boolean lb5 = true;
            boolean lb6 = false;
            ab2 = fd1 > ld1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[5][5] += fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld0 = 712.1440065334803;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    Output.points[5][6] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fb1 && lb1;
    boolean lb3 = true;
    double ld4 = 563.4194866911098;
    lb2 = lb3 || fb0;
    Output.points[5][7] -= ld4;
    Thought lo5 = Thought25.getInstance(ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb3);
    Output.points[5][8] += fd0;
    double ld6 = 170.92530579024742;
    fd0 = fd1 - ld4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld7 = 957.8114790279456;
    ld6 *= -1;
    fb1 = lb1 && lb2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld7, ad1, ad2, ad3, lb3, fb0, fb1, lb1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(ao1 != null){
      lb1 = ao1.m2(ld6, ld7, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(lb2, lb3, fb0, fb1);
}
if(ao3 != null){
      ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ld4, ld6, ld7, ad1, lb1, lb2, lb3, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    Output.points[6][0] -= fd1;
    boolean lb1 = false;
    ab2 = fd0 < fd1;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 > ad1;
if(ao3 != null){
      ad2 = ao3.m3();
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        boolean lb2 = false;
        boolean lb3 = true;
        double ld4 = 963.5247925574259;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = fd1 > ld4;
        fb1 = lb1 || lb2;
        ad1 = ad2 + ad3;
if(fo1 != null){
          lb3 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld4, lb0, ab1, ab2, ab3);
}
        ad1 = ad2 + ad3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought35.getInstance(fd1, fd0, fd1, fd0);
    Output.points[6][1] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    double ld0 = 512.895563310089;
    ld0 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3();
}
        ab2 = ab3 || ab4;
        }
    double ld1 = 378.27834852670895;
    Thought lo2 = Thought60.getInstance(ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
    boolean lb3 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 - fd1;
    Thought lo4 = Thought18.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 353.4642349388282;
    double ld1 = 11.369586159618857;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > ad1;
    boolean lb2 = false;
        fb0 = ad2 > ad3;
    fb1 = !lb2;
    Output.points[6][2] += ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld1);
}
    Thought lo3 = Thought63.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    fb1 = lb2 || fb0;
    boolean lb4 = false;
    double ld5 = 93.75456142032094;
    fb0 = fb1 || lb2;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ld5, lb4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = ad2 < ad3;
    ab1 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ab3 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    lb1 = !ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    Thought lo0 = Thought61.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought84.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
        boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb3 = fd0 > fd1;
    fb0 = fb1 && lb2;
    lb3 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][3] += ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[6][4] += ad3;
    fb1 = ad4 < fd0;
    boolean lb1 = false;
    lb0 = !lb1;
    fb0 = fb1 || lb0;
    double ld2 = 741.4194391006829;
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    Thought lo3 = Thought62.getInstance();

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = !ab1;
    Output.points[6][5] -= fd0;
    Output.points[6][6] -= fd1;
    Thought lo0 = Thought89.getInstance(ao2, ao3, ao4, fo0);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought96.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][7] -= fd0;
    Output.points[6][8] -= fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = fd1 < fd0;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought30.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
    double ld1 = 675.0943723079934;
    ld1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought72.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought99.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    if (lb1) {
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        Thought lo3 = Thought29.getInstance(fd1, fd0, fd1, fd0);
        Thought lo4 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        fb1 = fd1 < fd0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd0 = fd1 + fd0;
    double ld2 = 494.9975893303709;
        lb0 = !lb1;
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = lb1 && lb3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld4 = 66.31016170605326;

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    lb0 = lb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1();
}
    double ld3 = 204.83880083055544;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 59.32184538050817;
if(fo0 != null){
      fo0.m2(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[7][0] -= ld0;
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb2, ab1, ab2);
}
    ab3 = fd1 < ld0;
    ab4 = ad1 < ad2;
    fb0 = fb1 && lb2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = fd1 < ld0;
    double ld3 = 431.48720807472705;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought78.getInstance(ad4, fd0, fd1, ld0);
    ld3 = ad1 - ad2;
    Output.points[7][1] -= ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(lb0, fb0, fb1, lb0);
}
    Output.points[7][2] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        lb0 = fd1 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = !fb1;
    Output.points[7][3] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought83.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      fb1 = ao4.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld1 = 563.5428631164245;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    double ld3 = 171.74877516845726;
    boolean lb4 = false;
    Output.points[7][4] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, lb4);
}
    fd0 = fd1 - ld1;
    boolean lb5 = true;
    ld3 = ad1 - ad2;
    lb5 = ad3 < ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
    Thought lo2 = Thought93.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
    Output.points[7][5] -= fd0;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought59.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb1 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo2 = Thought50.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, ab1);
    fd0 = fd1 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    Output.points[7][6] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld3 = 635.3045514271164;
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
    double ld4 = 807.6249740172962;
if(fo1 != null){
      ld4 = fo1.m3();
}
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld3, ld4, fb0, fb1, lb0, lb1);
}
    lb2 = fd0 > fd1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[7][7] -= fd0;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !ab1;
    ab2 = !ab3;
    Thought lo2 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad1 *= -1;
        boolean lb0 = false;
        Output.points[7][8] -= ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        } else if (fb1) {
        } else {
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
        fb1 = ad3 > ad4;
        for(int i0=0; i0<10; i0++){
            lb1 = fb0 || fb1;
            lb1 = fb0 || fb1;
            fd0 *= -1;
            }
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
        if (lb1) {
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought50.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    Thought lo2 = Thought28.getInstance();
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    lb1 = ad3 > ad4;
    double ld3 = 330.0488319413457;
    ad4 *= -1;
    Thought lo4 = Thought69.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    boolean lb5 = false;
    ab4 = !fb0;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb5, ab1);
}
    Thought lo6 = Thought66.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 = ld3 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought72.getInstance();
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought90.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fd0 > fd1;
    double ld1 = 482.4605899214333;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ld1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    lb4 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb2, lb3, lb4);
}
    ld1 = ad1 + ad2;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[8][0] += ad3;
    fb1 = !lb2;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb3 = lb4 && fb0;
    double ld5 = 569.596865196134;
    fb1 = ld5 > ad1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb2, lb3, lb4, fb0);
}
    double ld6 = 333.2120083962823;
    double ld7 = 5.396986644019325;
    boolean lb8 = false;
    fb0 = fb1 && lb2;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    Output.points[8][1] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    boolean lb0 = false;
    boolean lb1 = false;
    Output.points[8][2] += fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = lb1 && ab1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Thought lo0 = Thought92.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
    ab2 = ad1 < ad2;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld6 = 539.3661194815556;
    ld6 *= -1;
    ab2 = ab3 && ab4;
    Thought lo7 = Thought56.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb2, lb3);
}
    Thought lo8 = Thought47.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ld6, ad1, ad2, ad3, lb4, lb5, ab1, ab2);
}
    ad4 *= -1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Output.points[8][3] -= fd0;
    lb0 = fb0 || fb1;
    double ld2 = 795.8894078627444;
    boolean lb3 = false;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb4 = true;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    lb0 = lb3 || lb4;
    lb5 = fd1 > ld2;
    double ld6 = 576.9293665417338;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, lb3, lb4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 959.7769876434442;
if(fo0 != null){
          fd0 = fo0.m3();
}
    Output.points[8][4] -= fd1;
    boolean lb1 = false;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        boolean lb2 = true;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
    lb2 = !fb0;
    Thought lo4 = Thought16.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 752.1554685696401;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fd0 = fd1 + ld0;
    fb0 = fb1 || lb1;
    Output.points[8][5] -= fd0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought27.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    lb3 = fd1 < ld0;
    fb0 = fb1 && lb1;
    lb3 = fd0 < fd1;
    double ld4 = 165.84405336643556;
    ld0 *= -1;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4);
}
    fb0 = fb1 && lb1;
        Output.points[8][6] += fd0;
    fd1 = ld0 + ld4;
    double ld5 = 873.589717915458;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
