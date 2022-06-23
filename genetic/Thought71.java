package genetic;
import java.util.ArrayList;
class Thought71 extends Thought{
private static ArrayList<Thought71> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 171.48883664583406;
private double fd1 = 59.167130491256444;
private Thought fo0 = null;
private Thought fo1 = null;
Thought71 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought71 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought71 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought21.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb1, lb2);
}
    double ld3 = 315.71520493019614;
    double ld4 = 43.08155324526164;
    boolean lb5 = false;
    double ld6 = 212.61333874387756;
    ld3 *= -1;
if(fo1 != null){
      ld4 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(ld6, fd0, fd1, ld3, lb5, fb0, fb1, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb5 = ld4 < ld6;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld4, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    double ld7 = 305.7764132359639;
if(fo0 != null){
      fo1 = fo0.m4(ld6, ld7, fd0, fd1);
}
    lb5 = !fb0;
    double ld8 = 875.5980197429051;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld3, ld4, ld6, ld7);
}
    fb1 = ld8 < fd0;

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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = ab1 && ab2;
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
        ab1 = fd1 > fd0;
        ab2 = !ab3;
        ab4 = fd1 < fd0;
        Output.points[1][1] += fd1;
        Thought lo1 = Thought45.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && lb0;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        Thought lo2 = Thought79.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2();
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        boolean lb2 = false;
        double ld3 = 487.26569546727774;
        lb2 = lb0 && fb0;
        fd0 = fd1 - ld3;
        ad1 = ad2 + ad3;
        fb1 = ad4 > fd0;
        for(int i1=0; i1<10; i1++){
            boolean lb4 = true;
            lb4 = lb1 && lb2;
            boolean lb5 = true;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld3, ad1, ad2);
}
            Thought lo6 = Thought33.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
              fo0 = fo1.m4(lb2, lb0, fb0, fb1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[1][2] -= fd0;
    Thought lo0 = Thought17.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[1][3] += fd0;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    double ld4 = 614.6047793714102;
if(fo1 != null){
      fo1.m1(lb1, lb2, lb3, ab1);
}
    boolean lb5 = true;
    ld4 = ad1 + ad2;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo6 = Thought87.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
    lb2 = ld4 < ad1;
    Thought lo7 = Thought18.getInstance(fo0, fo1, fo0, fo1);

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
            fb1 = lb0 || fb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = fd0 < fd1;
    lb0 = fb0 || fb1;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
    double ld0 = 776.798564563117;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    if (fb0) {
        ad1 = ad2 + ad3;
        fb1 = !lb1;
        Output.points[1][4] -= ad4;
        Thought lo2 = Thought59.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
        fd0 = fd1 + ld0;
        fb1 = ad1 < ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
if(ao4 != null){
          ao4.m3(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        ad1 = ad2 - ad3;
        double ld3 = 446.5739253958699;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
        boolean lb4 = false;
        for(int i0=0; i0<10; i0++){
            ad4 = fd0 - fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Output.points[1][5] -= fd1;
    Thought lo0 = Thought51.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][6] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][7] += fd0;
    Thought lo1 = Thought3.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 963.4213522001533;
    fd0 *= -1;
    Thought lo3 = Thought73.getInstance(ao3, ao4, fo0, fo1);
        Output.points[1][8] += fd1;
    boolean lb4 = false;
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    lb4 = fd0 > fd1;

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
    Thought lo0 = Thought36.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    Thought lo2 = Thought20.getInstance(ad4, fd0, fd1, ad1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fd1 = fo0.m3(fb0, fb1, lb1, ab1);
}
            double ld3 = 548.8365302758425;
            ab2 = ab3 || ab4;
if(ao1 != null){
              fo1 = ao1.m4();
}
            fb0 = ld3 < ad1;
            double ld4 = 54.0942833396702;
if(ao3 != null){
              ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
            boolean lb5 = false;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
            ab2 = fd1 < ld3;
            ab3 = ld4 > ad1;
            ab4 = !fb0;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb5, lb1, ab1);
}
            double ld6 = 527.9236486590449;
            boolean lb7 = false;
            ab1 = fd0 > fd1;
            ab2 = ab3 || ab4;
            double ld8 = 609.499604931189;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb5, lb7);
}
            lb1 = ld3 > ld4;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fd0 > fd1;
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fd0 *= -1;
    ab1 = !ab2;
    Thought lo1 = Thought6.getInstance();
    boolean lb2 = true;
    Thought lo3 = Thought40.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld4 = 828.6890566537757;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb1, lb0, lb2, ab1);
}
    Output.points[2][0] -= fd1;
    ab2 = ab3 && ab4;
    Output.points[2][1] -= ld4;
    fd0 *= -1;
    Output.points[2][2] -= fd1;
    fb0 = fb1 && lb0;
    lb2 = ld4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld4, fd0);
}
    lb0 = fd1 > ld4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Output.points[2][3] += ad4;
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
    boolean lb1 = true;
    double ld2 = 196.8729270748371;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
    double ld3 = 320.7986071055944;
    lb1 = ad1 > ad2;
    Output.points[2][4] += ad3;
    Thought lo4 = Thought32.getInstance(fb0, fb1, lb0, lb1);
    double ld5 = 305.0930021174119;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][5] += ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    Output.points[2][6] -= fd1;
if(fo1 != null){
      fo1.m3();
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
    lb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    Thought lo2 = Thought67.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    lb1 = !ab1;
    ad2 = ad3 + ad4;
    double ld3 = 991.6239352106226;
    ab2 = ad4 < fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fd1, ld3, ad1, ad2);
}
    ab2 = ad3 > ad4;

Thought.STACK_COUNTER++;
return ab3;
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
    boolean lb0 = false;
    double ld1 = 341.40545066349324;
    Thought lo2 = Thought38.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    fd1 = ld1 + fd0;
    if (lb0) {
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(lb0, fb0, fb1, lb0);
}
        fd1 *= -1;
        ld1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[2][7] += ld1;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fd0 = fd1 + ld1;
        Thought lo3 = Thought81.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
        lb0 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, fd0, fd1);
}
        fb0 = !fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
        for(int i0=0; i0<10; i0++){
            boolean lb4 = false;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
          ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 192.65772566801175;
    Thought lo1 = Thought56.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 > fd0;
    Output.points[2][8] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Thought lo0 = Thought26.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld1 = 72.73180324554414;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ld1 = fd0 + fd1;
    fb0 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb1 = fd1 < ld1;
    Thought lo2 = Thought39.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought31.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    fd1 = ad1 + ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought53.getInstance(ab3, ab4, fb0, fb1);
    boolean lb3 = false;
    lb1 = lb3 || ab1;
    ab2 = ab3 || ab4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    if (lb0) {
if(fo1 != null){
          fo1.m2();
}
        boolean lb1 = true;
        Thought lo2 = Thought80.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
        boolean lb3 = true;
        fd0 = fd1 + fd0;
        boolean lb4 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][0] -= fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    ab1 = !ab2;
        fd1 = fd0 - fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][1] -= ad2;
    Thought lo0 = Thought96.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    lb1 = ad3 < ad4;
    Output.points[3][2] += fd0;
    Thought lo2 = Thought49.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    lb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    double ld3 = 832.4092007179606;
    Thought lo4 = Thought1.getInstance(ad3, ad4, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        Output.points[3][3] -= ld3;
}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 358.4267676618602;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        ld0 = ad1 + ad2;
        ab1 = !ab2;
        boolean lb2 = false;
        ab2 = ad3 < ad4;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb3 = false;
        lb1 = ad3 > ad4;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        if (fb1) {
            Thought lo0 = Thought27.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
            fd0 = fd1 - fd0;
            fd1 *= -1;
            fb0 = fb1 || fb0;
            double ld1 = 442.7720360719717;
            double ld2 = 108.58062644594068;
if(ao3 != null){
              ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
            boolean lb3 = false;
if(fo0 != null){
              ao4 = fo0.m4();
}
            ld1 *= -1;
            ld2 *= -1;
            fb0 = fd0 > fd1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought87.getInstance(ao4, fo0, fo1, ao1);
    fd1 = ad1 - ad2;
    fb0 = !fb1;
    Output.points[3][4] -= ad3;
    boolean lb1 = true;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    double ld2 = 78.95545843927839;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = true;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought52.getInstance(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
    fb0 = ad4 > fd0;
    boolean lb5 = false;
    double ld6 = 118.59203522751162;
    double ld7 = 485.3361946098139;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        double ld8 = 206.5153035069749;
}
Thought.STACK_COUNTER++;
return ld2;
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
        double ld0 = 393.43061932416896;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    fd1 = ld0 + fd0;
    ab4 = fb0 || fb1;
    fd1 *= -1;
    Output.points[3][5] -= ld0;
        boolean lb3 = false;
    lb1 = fd0 < fd1;
    Output.points[3][6] += ld0;
    boolean lb4 = true;
    lb2 = lb3 || lb4;
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ld0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    ab1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
    double ld2 = 877.1312039153773;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought59.getInstance(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought76.getInstance();
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 || ab2;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[3][7] -= fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
        boolean lb0 = false;
        fd0 = fd1 + fd0;
}
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
    double ld0 = 642.7947072219292;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo1 = Thought70.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    boolean lb3 = true;
    fd1 = ld0 + fd0;
    Thought lo4 = Thought68.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m2();
}
    Thought lo7 = Thought80.getInstance(fd0, fd1, ld0, fd0, lb5, lb6, ab1, ab2);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[3][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb8 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb5, lb6);
}
    lb8 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 777.6482603758113;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[4][0] += fd0;
    boolean lb1 = true;
    fd1 = ld0 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought26.getInstance(fb1, lb1, fb0, fb1);
    lb1 = !fb0;
    fd1 *= -1;
    fb1 = ld0 > ad1;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought95.getInstance();
    double ld6 = 892.248404154108;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, lb1, lb3, lb4, fb0);
}
    boolean lb7 = true;
    fb0 = ld6 > ad1;
    fb1 = !lb1;
    ad2 *= -1;
    lb3 = ad3 < ad4;
        boolean lb8 = false;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 492.8697799960498;
    ab1 = ld0 > ad1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 609.2025548456099;
    ab3 = !ab4;
    boolean lb2 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
    boolean lb3 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb2 && lb3;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    boolean lb4 = true;
    double ld5 = 581.1952724210497;
if(fo0 != null){
      lb4 = fo0.m2(ab1, ab2, ab3, ab4);
}
    Thought lo6 = Thought69.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ld5, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb4 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > ld5;
    lb2 = !lb3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
}
    Output.points[4][1] -= ad1;
    boolean lb7 = false;
    double ld8 = 915.67166611642;

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
    Output.points[4][2] += fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought45.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        }
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, lb2, fb0);
}
    boolean lb3 = false;
    for(int i1=0; i1<10; i1++){
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
        lb3 = !fb0;
        boolean lb4 = false;
        double ld5 = 276.98676826351766;
        Thought lo6 = Thought65.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld5, fd0, fd1, ld5, fb0, fb1, lb4, lb1);
}
        double ld7 = 609.5407761202864;
        boolean lb8 = false;
        ld7 = fd0 + fd1;
        if (lb1) {
            lb2 = lb3 || fb0;
            fb1 = lb4 && lb8;
}}
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
    boolean lb0 = true;
    Thought lo1 = Thought34.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
    Output.points[4][3] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = ad4 < fd0;
    Output.points[4][4] += fd1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Output.points[4][5] -= fd0;
    double ld1 = 43.97009249838643;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo2 = Thought32.getInstance(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1);
}
    double ld3 = 893.3283995327257;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld1);
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
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2();
}
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab1 = fd0 > fd1;
        ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought64.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    ad2 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought85.getInstance(ad3, ad4, fd0, fd1);
    boolean lb2 = true;
    ad1 = ad2 - ad3;
    boolean lb3 = false;
    lb2 = !lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}

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
    fb1 = fd1 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
        lb2 = fd0 > fd1;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought52.getInstance(lb1, lb2, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb4 = false;
    Output.points[4][6] += fd1;
    fd0 = fd1 - fd0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
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
        double ld0 = 770.3978070157887;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fd0 = fd1 + ld0;
    fb0 = fb1 || lb1;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought38.getInstance(fd0, fd1, ld0, fd0);
    Thought lo4 = Thought28.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, lb1, lb5, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb5 = fd0 > fd1;
    double ld6 = 816.3502260922363;
    fb0 = ld0 > ld6;
    fd0 = fd1 + ld0;
    fb1 = !lb1;
    double ld7 = 717.4158996730505;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld6, ld7, fd0, fd1, lb5, fb0, fb1, lb1);
}
    Output.points[4][7] += ld0;

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
    fd1 = fd0 + fd1;
    Output.points[4][8] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought31.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = lb1 || fb0;
    Output.points[5][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought74.getInstance();
    double ld3 = 354.9433963578335;

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
