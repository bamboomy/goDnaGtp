package genetic;
import java.util.ArrayList;
class Thought27 extends Thought{
private static ArrayList<Thought27> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 305.765128889682;
private double fd1 = 380.25587656164595;
private Thought fo0 = null;
private Thought fo1 = null;
Thought27 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought27 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought27 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 78.42669329552787;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo1 = Thought52.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
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
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    Output.points[7][8] += fd0;
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 13.588626706975234;
    Thought lo1 = Thought15.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    boolean lb3 = false;
    lb2 = !lb3;
    Thought lo4 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    ab1 = ab2 || ab3;
    boolean lb5 = true;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Output.points[8][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, lb5, ab1);
}
    fd1 *= -1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][1] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;

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
    fb0 = fb1 || fb0;
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 933.6876542245806;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    Output.points[8][2] -= ld0;

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
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        ab2 = !ab3;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
        Output.points[8][3] -= ad4;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[8][4] -= ad2;
        ab4 = !fb0;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        fb1 = ad1 > ad2;
        ad3 *= -1;
        if (ab1) {
            ad4 *= -1;
            fd0 = fd1 + ad1;
            boolean lb0 = true;
            ab1 = ad2 < ad3;
            Output.points[8][5] -= ad4;
            Output.points[8][6] -= fd0;
            fd1 *= -1;
if(fo0 != null){
              ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
            fb1 = ad2 < ad3;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought63.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Output.points[8][7] += fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][8] -= fd1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought9.getInstance();
    fb0 = fd0 > fd1;
    Thought lo2 = Thought77.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought88.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Thought lo4 = Thought65.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    if (fb1) {
        fb0 = fb1 && fb0;
        fb1 = !fb0;
        Output.points[0][0] += ad3;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad4 = fd0 + fd1;
        fb1 = ad1 < ad2;
if(ao4 != null){
          fb0 = ao4.m2(ad3, ad4, fd0, fd1);
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
    Thought lo0 = Thought89.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    Output.points[0][1] += fd1;
    Thought lo2 = Thought1.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, ab1, ab2, ab3);
}
    Output.points[0][2] += fd0;

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
    double ld0 = 314.98286491302036;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ld0 < ad1;
if(ao2 != null){
      ao2.m2();
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[0][3] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo1 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    boolean lb2 = false;
    Thought lo3 = Thought11.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (lb2) {
        fd0 *= -1;
        double ld4 = 176.00597531418887;
}
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = !ab1;
    Output.points[0][4] -= fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
        fb1 = ad4 < fd0;
    fd1 *= -1;
    lb0 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        double ld2 = 465.5105245243893;
        fb0 = ad1 > ad2;
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
    boolean lb0 = false;
    Thought lo1 = Thought72.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    Output.points[0][5] += fd1;
    ab4 = ad1 < ad2;
    Thought lo2 = Thought64.getInstance();
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb3, lb4, ab1);
}
    ad1 = ad2 + ad3;
    boolean lb5 = false;
    Thought lo6 = Thought26.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    Thought lo7 = Thought38.getInstance(fd0, fd1, ad1, ad2, lb3, lb4, lb5, ab1);
    boolean lb8 = false;
if(fo1 != null){
      ad3 = fo1.m3();
}
        ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld9 = 30.7916517574152;
    Thought lo10 = Thought17.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld9);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb1 = false;
    lb0 = !lb1;
    double ld2 = 756.783989050526;
    Output.points[0][6] -= ld2;
    fb0 = !fb1;
    Output.points[0][7] += fd0;
    Thought lo3 = Thought71.getInstance(fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
    lb0 = !lb1;
    boolean lb4 = false;
    lb4 = ld2 > fd0;
    fb0 = fb1 && lb0;
    lb1 = fd1 > ld2;
    boolean lb5 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 629.5458531499706;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
        lb1 = fd1 < ld0;
if(ao4 != null){
          ad1 = ao4.m3(fb0, fb1, lb1, fb0);
}
        double ld2 = 970.2702677376016;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 480.92083263964594;
    Output.points[0][8] -= ld0;
    fd0 = fd1 - ld0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        Output.points[1][0] -= ld0;
        Output.points[1][1] += fd0;
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        double ld1 = 378.191590544671;
if(ao4 != null){
          ao4.m1(fd0, fd1, ld1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, ld0);
}
        double ld2 = 255.31055237099966;
        Thought lo3 = Thought78.getInstance(fb1, ab1, ab2, ab3);
        ld0 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    Output.points[1][2] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    if (ab4) {
        fb0 = fb1 && lb0;
        } else {
        Thought lo1 = Thought71.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
        fb0 = !fb1;
        lb0 = ad4 < fd0;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m3();
}
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
}
Thought.STACK_COUNTER++;
return ab1;
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
    fb0 = fb1 || fb0;
    Output.points[1][3] += fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[1][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 184.82645723997982;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = ld0 - fd0;
    double ld1 = 525.8067329413469;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[1][5] -= fd1;
    lb0 = fd0 < fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    Output.points[1][6] += fd1;
    fd0 *= -1;
    double ld2 = 351.79193448896757;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    lb0 = !fb0;
    fb1 = !lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;
    ad3 *= -1;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought32.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    Output.points[1][7] -= ad4;
    fd0 = fd1 - ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    Thought lo0 = Thought73.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 733.4448773241223;
    Output.points[1][8] += ld1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
    Output.points[2][0] -= ad4;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
    double ld2 = 637.4770532490944;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld1);
}
    double ld3 = 686.4236136137017;
    ld2 = ld3 - ad1;
    double ld4 = 699.3826059726483;
if(fo1 != null){
      ad1 = fo1.m3(fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    Thought lo5 = Thought46.getInstance(fo1, fo0, fo1, fo0, ld3, ld4, ad1, ad2, fb0, fb1, ab1, ab2);
    double ld6 = 333.66949015090375;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Output.points[2][1] += ad2;
    Thought lo7 = Thought22.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return ad3;
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
    Thought lo0 = Thought36.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        boolean lb1 = true;
        boolean lb2 = false;
if(ao3 != null){
          fd1 = ao3.m3(lb2, fb0, fb1, lb1);
}
        if (lb2) {
            fb0 = fb1 || lb1;
            Output.points[2][2] -= fd0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
              lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
            fb0 = !fb1;
            lb1 = lb2 && fb0;
            fb1 = fd1 < fd0;
            fd1 *= -1;
            lb1 = fd0 < fd1;
            fd0 = fd1 + fd0;
            lb2 = !fb0;
            Thought lo3 = Thought19.getInstance(ao3, ao4, fo0, fo1);
            fd1 *= -1;
            double ld4 = 383.76168653215876;
            ld4 = fd0 + fd1;
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
    Thought lo0 = Thought76.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
        boolean lb3 = true;
        Output.points[2][3] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb4 = true;
        boolean lb5 = false;
if(fo0 != null){
          fo0.m1(fd0, fd1, ad1, ad2, lb1, lb2, lb3, lb4);
}
        Output.points[2][4] += ad3;
        lb5 = ad4 < fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
        }
    boolean lb6 = false;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Output.points[2][5] += fd1;
if(ao3 != null){
      ad1 = ao3.m3(fb1, lb6, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad2;
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    double ld0 = 565.2304474172349;
    double ld1 = 387.81395213167565;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld2 = 689.1283543457698;
    ab1 = ld0 < ld1;
    ab2 = ab3 || ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][6] -= ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld0 = 167.14522183558063;
    fb0 = ad3 < ad4;
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao4.m2();
}
    fd0 = fd1 + ld0;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;

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
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = fb0 && fb1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 903.6723628226626;
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
        fb1 = fd1 < ld0;
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
        fb0 = !fb1;
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
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    double ld1 = 635.6561360898756;
    ab4 = fb0 && fb1;
    ld1 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2();
}
    Output.points[2][7] -= fd0;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    boolean lb2 = false;

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
        fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
        lb1 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
        ad4 = fd0 - fd1;
        fb0 = !fb1;
        double ld2 = 54.87097777078197;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 849.6537457666858;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ld3, ad1, ad2);
}
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
        boolean lb4 = true;
        ld2 = ld3 + ad1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought4.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    Output.points[2][8] -= fd0;
    Thought lo2 = Thought12.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    boolean lb3 = false;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb4 = false;
    fd1 = fd0 - fd1;
    Thought lo5 = Thought70.getInstance(lb4, fb0, fb1, lb0);
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb0);
}
    fd1 *= -1;
    Output.points[3][0] -= fd0;
    double ld6 = 802.3513632540773;

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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
    double ld0 = 395.93665773233414;
    ad2 = ad3 + ad4;
    Output.points[3][1] += fd0;
    double ld1 = 463.63550188209837;
    fb0 = !fb1;
    boolean lb2 = true;
    fd0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1, lb2, lb3, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = fd1 < fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab4 = !fb0;
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    Output.points[3][2] += fd1;
    fd0 = fd1 + fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        }
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Output.points[3][3] += ad2;
    ab1 = ad3 > ad4;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    Thought lo1 = Thought20.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    fb0 = fb1 || lb0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    Output.points[3][4] -= fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Output.points[3][5] -= fd0;
    double ld0 = 308.6127802003511;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fd0 *= -1;
    Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
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
    Output.points[3][6] -= fd1;
    fd0 = fd1 - fd0;
    double ld0 = 35.36244257375244;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[3][7] -= ld0;
    lb1 = !fb0;
    fb1 = !lb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[3][8] += fd0;
    fd1 *= -1;
    fb0 = !fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought12.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
}
