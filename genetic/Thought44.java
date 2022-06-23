package genetic;
import java.util.ArrayList;
class Thought44 extends Thought{
private static ArrayList<Thought44> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 521.5775050729861;
private double fd1 = 7.38977600341222;
private Thought fo0 = null;
private Thought fo1 = null;
Thought44 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought44 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought44 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought44 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought44 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought35.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    boolean lb2 = true;
    lb2 = !fb0;
    double ld3 = 957.5299640106603;
    fd0 *= -1;
    fb1 = !lb0;
    Output.points[5][5] += fd1;
    Output.points[5][6] -= ld3;
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fd0 < fd1;
    boolean lb4 = false;
    ld3 *= -1;
    fd0 = fd1 + ld3;
    lb4 = fd0 < fd1;
    ld3 = fd0 - fd1;
    fb0 = !fb1;

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
    ab1 = !ab2;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought43.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        ab1 = ab2 || ab3;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        Output.points[5][7] += fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
        boolean lb2 = true;
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
    double ld0 = 751.157281554127;
    Thought lo1 = Thought12.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought92.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1);
}
    Thought lo3 = Thought55.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    ad2 = ad3 - ad4;
    Output.points[5][8] -= fd0;
    boolean lb4 = true;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, lb4, fb0, fb1, lb4);
}
        double ld5 = 569.3575994378058;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = ad2 < ad3;
        boolean lb6 = true;
        ad4 = fd0 + fd1;
        ld5 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3, lb6, lb4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      ad2 = fo1.m3();
}
    lb0 = !ab1;
    double ld1 = 48.527333738360504;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
    Thought lo3 = Thought97.getInstance(ab1, ab2, ab3, ab4);
    boolean lb4 = false;

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
        fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
        fd1 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought13.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Output.points[6][0] += fd0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought32.getInstance(fo0, fo1, ao1, ao2);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
        fd1 = fd0 + fd1;

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
    ad1 *= -1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought87.getInstance();
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought79.getInstance(fb0, fb1, lb0, lb1);

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
    ab1 = ab2 || ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 657.1677906140868;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought87.getInstance(fo1, ao1, ao2, ao3);
    Thought lo2 = Thought10.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(ao4 != null){
      ao4.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ab2 = ld0 < fd0;
    ab3 = ab4 || fb0;

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
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought6.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    Output.points[6][1] += ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    lb1 = fd0 < fd1;
    ab1 = ad1 < ad2;
        if (ab2) {
        ab3 = ad3 < ad4;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
        double ld2 = 172.00777235948578;
        Output.points[6][2] -= ad2;
        ab2 = ad3 > ad4;
        ab3 = !ab4;
        fd0 = fd1 + ld2;
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Output.points[6][3] -= fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    double ld0 = 829.484887652212;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought24.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = fd1 > ld0;
    lb4 = ad1 > ad2;
    double ld5 = 808.2520431536266;
    double ld6 = 752.7646417914627;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, lb4);
}
    Thought lo7 = Thought77.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb4);
    fb0 = fd1 < ld0;
    ld5 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld8 = 720.2631349881444;
        fb1 = lb3 || lb4;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb4 = true;
    lb1 = lb2 || lb3;
    lb4 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb6 = true;
        lb1 = lb2 && lb3;
        fd1 = ad1 - ad2;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          lb4 = fo1.m2(ad3, ad4, fd0, fd1, lb5, ab1, ab2, ab3);
}
        Output.points[6][4] -= ad1;
        Thought lo7 = Thought78.getInstance(fo0, fo1, fo0, fo1);
        boolean lb8 = true;
        ab3 = ab4 && fb0;
        ad2 = ad3 + ad4;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb6, lb8, lb0, lb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3();
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb1 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    Output.points[6][5] += ad3;
    lb1 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 + fd0;
    Output.points[6][6] -= fd1;
    fb1 = lb0 && lb1;
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    double ld0 = 933.6716704930149;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought6.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
    Output.points[6][7] += fd1;
    Output.points[6][8] += ld0;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    Thought lo4 = Thought93.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb1);
}
    boolean lb5 = true;
    lb3 = ld0 > fd0;
    boolean lb6 = true;
    lb5 = fd1 > ld0;
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0, lb6, ab1, ab2, ab3);
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought93.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ad1;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    Thought lo1 = Thought22.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ab1 = ao3.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought16.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
        double ld3 = 196.02246174907643;
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ld3, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    double ld4 = 895.9516083689456;
    ld3 = ld4 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[7][0] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    if (lb1) {
        boolean lb2 = true;
        Thought lo3 = Thought61.getInstance(fd0, fd1, fd0, fd1);
        Thought lo4 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        double ld5 = 710.4494907141635;
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb2, lb0);
}
        ld5 *= -1;
        Thought lo6 = Thought93.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld5, fd0, lb1, fb0, fb1, lb2);
}
        for(int i0=0; i0<10; i0++){
            lb0 = lb1 && fb0;
            fb1 = lb2 && lb0;
            double ld7 = 755.9622446595166;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
            Thought lo8 = Thought21.getInstance(fo1, fo0, fo1, fo0, fd1, ld7, ld5, fd0, lb1, fb0, fb1, lb2);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
              lb2 = fo1.m2(fd1, ld7, ld5, fd0);
}
            lb0 = fd1 < ld7;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld7);
}
            Output.points[7][1] += ld5;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    Thought lo1 = Thought58.getInstance();
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    ab1 = fd1 < fd0;
    boolean lb2 = false;

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
    Thought lo0 = Thought93.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    Thought lo3 = Thought1.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought24.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    Thought lo5 = Thought21.getInstance();
    Thought lo6 = Thought64.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb2, fb0);
    fb1 = lb2 || fb0;
    fb1 = !lb2;
    fb0 = fb1 && lb2;
    boolean lb7 = false;
    ad3 = ad4 + fd0;
    boolean lb8 = true;
    boolean lb9 = true;
    boolean lb10 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
    ab2 = fd0 > fd1;
    Thought lo0 = Thought35.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought59.getInstance(ab1, ab2, ab3, ab4);
    Output.points[7][2] += fd1;
    fb0 = ad1 > ad2;
    double ld2 = 11.911876079635082;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo0 = Thought2.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    Output.points[7][3] += fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 414.9427797296358;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    boolean lb2 = true;
    ad1 *= -1;
    lb2 = !fb0;
    boolean lb3 = false;
    boolean lb4 = true;
if(ao1 != null){
      lb4 = ao1.m2(fb0, fb1, lb1, lb2);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      lb3 = ao2.m2();
}
    lb4 = fb0 || fb1;
    boolean lb5 = true;
    boolean lb6 = false;
    lb1 = lb2 && lb3;
    boolean lb7 = true;
    lb4 = lb5 && lb6;
    Output.points[7][4] += fd0;
    lb7 = !fb0;
if(ao3 != null){
      ao3.m2(fd1, ld0, ad1, ad2, fb1, lb1, lb2, lb3);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb4 = lb5 || lb6;
    if (lb7) {
        fb0 = ad4 < fd0;
        double ld8 = 417.8999997335501;
        fb1 = fd0 < fd1;
        Output.points[7][5] -= ld8;
        ld0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb1, lb2, lb3, lb4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought88.getInstance(fb0, fb1, ab1, ab2);
if(ao2 != null){
      ab3 = ao2.m2();
}
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    double ld1 = 392.65921186919843;
    Thought lo2 = Thought98.getInstance(fd0, fd1, ld1, fd0);
    fb0 = fd1 > ld1;
    boolean lb3 = false;
    Output.points[7][6] -= fd0;

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
    boolean lb0 = false;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought82.getInstance(ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo2 = Thought51.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ad1);
}
        lb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        }
    Output.points[7][7] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb3 = true;
    fd0 *= -1;
    Thought lo4 = Thought76.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    lb3 = ab1 || ab2;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb3);
}
    double ld5 = 932.3045846334727;
    double ld6 = 642.0721482340239;
    ab1 = ad2 > ad3;
if(ao2 != null){
      ab2 = ao2.m2();
}

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought60.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fd0 < fd1;
    Thought lo2 = Thought93.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb3, fb0, fb1);
}
    fd1 *= -1;
    Thought lo4 = Thought21.getInstance(fd0, fd1, fd0, fd1);
    boolean lb5 = false;
    fd0 *= -1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Output.points[7][8] += fd1;
    boolean lb0 = false;
    double ld1 = 95.16236595280412;
    ld1 *= -1;
    double ld2 = 611.3561889575919;
    if (lb0) {
        ab1 = ab2 && ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        double ld3 = 288.0865115073234;
        Output.points[8][0] += ld1;
        Thought lo4 = Thought60.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
        double ld5 = 216.71796344085865;
        ab2 = ld1 < ld2;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld3, ld5);
}
        ld1 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld3);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought17.getInstance(fb1, fb0, fb1, fb0);
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    double ld1 = 939.0567311697769;
if(fo0 != null){
      fo1 = fo0.m4();
}
        ad4 *= -1;
    Output.points[8][1] -= fd0;
    fd1 = ld1 - ad1;
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
    Output.points[8][2] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;

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
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        }
    Output.points[8][3] += ad4;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[8][4] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab4 = fd1 > ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > ad1;
    ab3 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ab4 = fb0 || fb1;
    Output.points[8][5] -= ad2;
    lb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;

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
    fb0 = fb1 && fb0;
    Output.points[8][6] += fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        lb0 = fb0 || fb1;
        boolean lb1 = false;
        } else if (lb0) {
        fb0 = fb1 && lb0;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(ao2 != null){
          ao2.m2(fb0, fb1, lb0, fb0);
}
        fb1 = fd0 > fd1;
if(ao3 != null){
          fd0 = ao3.m3();
}
        lb0 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
            fd0 *= -1;
            boolean lb2 = true;
            boolean lb3 = false;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb2, lb3, lb0, fb0);
}
            fb1 = lb2 && lb3;
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
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
    Output.points[8][7] += ad4;
    if (fb0) {
        fd0 = fd1 - ad1;
        boolean lb0 = false;
        Output.points[8][8] -= ad2;
        fb0 = !fb1;
        if (lb0) {
            fb0 = fb1 || lb0;
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
            fb1 = lb0 || fb0;
            fb1 = !lb0;
            fb0 = ad3 > ad4;
            fd0 = fd1 - ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    Thought lo0 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = !fb1;
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought70.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    double ld2 = 303.30975097103374;

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
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    double ld1 = 515.6752654796117;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
    boolean lb3 = false;
    Thought lo4 = Thought69.getInstance(fd0, fd1, ld1, ad1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Output.points[0][0] -= ld1;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
if(fo1 != null){
      lb0 = fo1.m2();
}
    lb2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb3, lb5, ab1, ab2);
}
    double ld6 = 847.7223801948829;
    boolean lb7 = false;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[0][1] += ld1;
    ab3 = ld6 > ad1;

Thought.STACK_COUNTER++;
return ao2;
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[0][2] -= fd1;
    Thought lo0 = Thought38.getInstance();
    Thought lo1 = Thought61.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 190.4861604838061;
        fb0 = fb1 || lb0;
    ld1 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      lb2 = fo0.m2(lb3, fb0, fb1, lb0);
}
    lb2 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, lb0, lb2, lb3);
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
    fd0 = fd1 - fd0;
    double ld0 = 906.8376561373034;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    double ld1 = 44.49711811833228;
    fb0 = !fb1;
    double ld2 = 989.2731839962661;
        ld1 = ld2 - fd0;
    fd1 = ld0 + ld1;
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
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
}
