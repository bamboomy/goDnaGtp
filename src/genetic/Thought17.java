package genetic;
import java.util.ArrayList;
class Thought17 extends Thought{
private static ArrayList<Thought17> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 766.8233900537601;
private double fd1 = 943.8052637476254;
private Thought fo0 = null;
private Thought fo1 = null;
Thought17 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought17 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought17 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][5] += fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    double ld0 = 756.2047192296487;
    boolean lb1 = true;
    double ld2 = 959.9738374361293;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    Output.points[6][6] -= ld2;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld2);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld4 = 243.6680074697437;
    boolean lb5 = true;
    ld0 *= -1;

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
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
        ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    Thought lo2 = Thought285.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(lb0, lb1, ab1, ab2);
}
    double ld3 = 210.4985051496622;
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = !fb1;
    boolean lb4 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought399.getInstance(ad4, fd0, fd1, ad1);
    Output.points[6][7] -= ad2;
    double ld3 = 880.8546243327556;
    Thought lo4 = Thought28.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Output.points[6][8] += ad3;
    lb1 = !fb0;
    ad4 *= -1;
    if (fb1) {
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1, lb5, lb0, lb1, fb0);
}
        fb1 = lb5 || lb0;
        lb1 = !fb0;
        fb1 = ad2 < ad3;
        double ld6 = 172.16844713340413;
        lb5 = lb0 || lb1;
        boolean lb7 = false;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb5);
}
        lb7 = ad3 > ad4;
        lb0 = lb1 || fb0;
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought200.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    if (ab2) {
        Output.points[7][0] += ad4;
        ab3 = ab4 && fb0;
        fd0 *= -1;
        Thought lo1 = Thought237.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
        Thought lo2 = Thought30.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
        ab2 = !ab3;
        ad4 = fd0 + fd1;
        ab4 = fb0 && fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Thought lo1 = Thought352.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 924.2769017127614;
        fd0 = fd1 + ld2;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
        lb0 = fb0 && fb1;
        Output.points[7][1] += ld2;
        fd0 = fd1 - ld2;
        fd0 = fd1 + ld2;
        fd0 = fd1 - ld2;
        Output.points[7][2] -= fd0;
        lb0 = fb0 && fb1;
        Thought lo3 = Thought193.getInstance(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        ld2 = fd0 + fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = lb0 || fb0;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    fb0 = fd1 > ad1;
    double ld2 = 367.40584665736435;
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld2, ad1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3();
}
    Output.points[7][3] -= ad3;
    lb0 = lb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    if (fb1) {
if(ao3 != null){
          lb0 = ao3.m2(lb1, fb0, fb1, lb0);
}
        lb1 = fb0 || fb1;
        lb0 = lb1 && fb0;
        fb1 = lb0 || lb1;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fb0 = ao3.m2(ad2, ad3, ad4, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 175.82038545977662;
    Output.points[7][4] -= ld0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab3 = ab4 && fb0;
    fd1 = ld0 - fd0;
    Thought lo1 = Thought56.getInstance(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb2 = false;
    double ld3 = 623.5329467765062;
    ld0 = ld3 + fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ab4 = ld3 > fd0;
    fb0 = fb1 || lb2;

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
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
if(ao1 != null){
          ab2 = ao1.m2();
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        fb0 = fb1 || ab1;
        }
    Thought lo0 = Thought274.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ab1 = ad4 < fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought366.getInstance();
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
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
    Thought lo0 = Thought56.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[7][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought395.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][6] -= fd1;
    double ld2 = 927.6271140012674;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb3;
    fb0 = !fb1;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}

Thought.STACK_COUNTER++;
return lb3;
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
    Thought lo0 = Thought46.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fb0 = fd1 < fd0;
    if (fb1) {
        fd1 *= -1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
        } else {
if(fo0 != null){
          fd1 = fo0.m3();
}
        ab4 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        Thought lo2 = Thought107.getInstance(ab2, ab3, ab4, fb0);
        fb1 = lb1 || ab1;
        ab2 = ab3 && ab4;
        double ld3 = 51.31774340967141;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld3;
        fd0 = fd1 - ld3;
        fd0 = fd1 + ld3;
        double ld4 = 972.5546541113787;
        fb0 = ld4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld3, ld4, fd0);
}
        fb1 = fd1 < ld3;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(ld4, fd0, fd1, ld3, lb1, ab1, ab2, ab3);
}
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
    if (fb1) {
        Output.points[7][7] += ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ad3 = fo1.m3();
}
        boolean lb0 = true;
        boolean lb1 = false;
        double ld2 = 983.345916965779;
        Thought lo3 = Thought152.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
        Output.points[7][8] -= ld2;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        lb0 = !lb1;
        } else if (fb0) {
        double ld4 = 508.18300616572503;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        } else if (fb0) {
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    double ld0 = 252.64626121069557;
    Thought lo1 = Thought218.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb2 = false;
    ab2 = fd1 < ld0;
    Thought lo3 = Thought162.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    Thought lo4 = Thought222.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Thought lo0 = Thought181.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    double ld1 = 851.397115027422;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    fb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fb1 = lb2 && fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb2, fb0, fb1);
}
if(ao2 != null){
          lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = ld1 < fd0;
    Output.points[8][0] -= fd1;
    Thought lo3 = Thought311.getInstance(ld1, fd0, fd1, ld1);
    fb1 = lb2 || fb0;
        fb1 = !lb2;
    Thought lo4 = Thought58.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    Thought lo5 = Thought247.getInstance(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
    double ld6 = 20.406057807903466;

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
    fb1 = ad1 > ad2;
    boolean lb0 = true;
    lb0 = ad3 > ad4;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb0);
}
    lb1 = ad4 > fd0;
    Thought lo2 = Thought237.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    double ld3 = 605.5541355540178;
    ld3 = ad1 + ad2;
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld3, ad1, ad2);
}

Thought.STACK_COUNTER++;
return lb1;
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
      ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    double ld2 = 723.2280879596683;
    lb1 = fd0 < fd1;
    ab1 = ld2 < fd0;

Thought.STACK_COUNTER++;
return ab2;
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
    ab1 = !ab2;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3();
}
        ab2 = ad2 > ad3;
    ab3 = ab4 && fb0;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought152.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = true;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought194.getInstance(fd0, fd1, ad1, ad2);
    boolean lb4 = false;
    lb2 = ad3 < ad4;
    Thought lo5 = Thought109.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    Thought lo6 = Thought192.getInstance(ad3, ad4, fd0, fd1, lb4, ab1, ab2, ab3);

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
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought351.getInstance();
    Output.points[8][1] -= fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    Output.points[8][2] -= fd0;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought226.getInstance(fd1, fd0, fd1, fd0);
        Output.points[8][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fd0 > fd1;

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
        fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    fd0 *= -1;
    ab3 = !ab4;
    Thought lo0 = Thought159.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        if (ab4) {
        fd0 = fd1 - fd0;
        double ld2 = 534.615133627551;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 - ad1;
    double ld3 = 117.01128310644357;
    lb0 = !lb1;
    boolean lb4 = true;

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
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        fd1 = ad1 + ad2;
        ab4 = fb0 && fb1;
        lb0 = ad3 < ad4;
        Output.points[8][5] += fd0;
        ab1 = ab2 || ab3;
        Thought lo1 = Thought189.getInstance(ab4, fb0, fb1, lb0);
        ab1 = ab2 && ab3;
        fd1 = ad1 - ad2;
        ab4 = ad3 > ad4;
        Output.points[8][6] -= fd0;
        double ld2 = 129.29409943946965;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        lb0 = !ab1;
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        lb0 = fd1 < ld2;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        lb0 = ad1 > ad2;
        ab1 = ad3 < ad4;
        fd0 *= -1;
        ab2 = !ab3;
        ab4 = fd1 > ld2;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 308.98579689853665;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
        if (fb1) {
if(ao3 != null){
              fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
              ao2.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
            fd1 = ld0 - fd0;
            Thought lo1 = Thought178.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}}
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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 *= -1;
    fb1 = fd0 < fd1;
    double ld0 = 315.6214635679779;
    ld0 *= -1;
    fb0 = ad1 > ad2;
    Thought lo1 = Thought288.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][7] -= fd0;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Output.points[8][8] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 || ab1;
    fd0 = fd1 - fd0;
    fd1 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ad2 *= -1;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb1 = false;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    Output.points[0][0] -= fd0;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
}
    Thought lo5 = Thought158.getInstance(lb0, lb1, lb2, lb3);
    Output.points[0][1] -= fd1;
    lb4 = fd0 < fd1;
    boolean lb6 = false;
    boolean lb7 = true;
    lb6 = fd0 < fd1;
    lb7 = fb0 && fb1;
    boolean lb8 = false;
    lb0 = lb1 && lb2;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld0 = 648.7874991260064;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
    double ld1 = 86.60123001013429;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = ld1 < fd0;

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
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought122.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ad1 *= -1;
    Thought lo2 = Thought282.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
    lb1 = ad2 < ad3;
    fb0 = ad4 < fd0;

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
    Output.points[0][2] += ad2;
    ab1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
    Output.points[0][3] -= fd1;
    Output.points[0][4] -= ad1;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought136.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought315.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought332.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    double ld2 = 274.16224039662467;
    fb0 = ld2 > fd0;
    double ld3 = 540.39082881723;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, ld3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    Output.points[0][5] -= fd1;
    ld2 = ld3 + fd0;
    fd1 = ld2 + ld3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, ld3, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, ld3, fd0);
}
    double ld4 = 874.4463699725467;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    double ld0 = 262.8841908637777;
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2();
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
            ad1 = ad2 + ad3;
            double ld1 = 805.550119074273;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            if (fb1) {
                ad3 *= -1;
if(fo1 != null){
                  fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
                Thought lo2 = Thought132.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
                double ld3 = 711.3565524240993;
                fb0 = ad3 > ad4;
                Output.points[0][6] -= fd0;
                fb1 = fd1 > ld3;
                ld1 = ld0 - ad1;
                Output.points[0][7] += ad2;
if(fo0 != null){
                  ad3 = fo0.m3(ad4, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
                fb0 = fb1 && fb0;
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
                } else {
                Output.points[0][8] -= ld0;
}}}
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab4 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought335.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought16.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[1][0] += fd0;
    ab3 = ab4 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    Thought lo0 = Thought181.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 = ad1 - ad2;
    ab2 = ad3 > ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld4 = 393.0319295062572;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
    lb1 = lb2 && lb3;
    Thought lo5 = Thought170.getInstance(ab1, ab2, ab3, ab4);
    ad1 *= -1;
    fb0 = fb1 && lb1;
    lb2 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 - fd1;
    Thought lo6 = Thought340.getInstance(ld4, ad1, ad2, ad3);
    boolean lb7 = false;
    lb3 = ad4 > fd0;
    fd1 = ld4 + ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ao1;
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld0 = 19.23512232223687;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    Output.points[1][2] -= fd0;
    Thought lo3 = Thought306.getInstance();
    Output.points[1][3] -= fd1;
    Thought lo4 = Thought0.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);

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
    Output.points[1][4] += fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
        boolean lb1 = false;

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
    Thought lo0 = Thought268.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][5] -= fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    Output.points[1][6] += fd0;
    double ld2 = 718.2541127205452;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought124.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
    Thought lo4 = Thought139.getInstance(fb0, fb1, lb1, fb0);
    fd1 = ld2 + fd0;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
    fb0 = fd0 < fd1;
    Output.points[1][7] += ld2;

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
