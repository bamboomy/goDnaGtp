package genetic;
import java.util.ArrayList;
class Thought94 extends Thought{
private static ArrayList<Thought94> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 874.1065100995376;
private double fd1 = 392.91519400052147;
private Thought fo0 = null;
private Thought fo1 = null;
Thought94 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought94 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought94 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    double ld0 = 735.9317347910425;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought22.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = true;
    double ld4 = 655.4292261426751;
    lb2 = lb3 || fb0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    double ld0 = 37.86641350812572;
    ab4 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought99.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    if (ab1) {
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        ab3 = fd1 < ld0;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        double ld2 = 230.24907037985204;
        ab2 = ab3 && ab4;
        fb0 = ld0 > fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ld2, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        double ld3 = 861.1377187741689;
        Output.points[4][7] -= ld2;
        ld3 = ld0 - fd0;
        fd1 = ld2 + ld3;
        Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1);
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld2, ab4, fb0, fb1, ab1);
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
    fb1 = fb0 || fb1;
    double ld0 = 451.70470363032075;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Output.points[4][8] -= ad4;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
        lb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        Thought lo2 = Thought31.getInstance(lb1, fb0, fb1, lb1);
        fb0 = fb1 || lb1;
if(fo0 != null){
          ad4 = fo0.m3();
}
        Thought lo3 = Thought5.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
        fb1 = ad2 > ad3;
        Output.points[5][0] += ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - ld0;
        ad1 = ad2 + ad3;
        double ld4 = 146.50767668779378;
        ad3 *= -1;
        if (lb1) {
            Thought lo5 = Thought18.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4, fb0, fb1, lb1, fb0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
            lb1 = ld0 < ad1;
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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[5][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    boolean lb0 = true;
    double ld1 = 377.7551664092774;
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;

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
    double ld0 = 688.3193850848227;
        Thought lo1 = Thought62.getInstance();
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    Output.points[5][2] -= ld0;
    double ld3 = 779.5968815239314;
if(ao1 != null){
      ld3 = ao1.m3(fd0, fd1, ld0, ld3, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld4 = 942.3015047812366;
    fb0 = !fb1;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    boolean lb5 = false;
    fb0 = ld3 < ld4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, lb5, fb0);
}
    double ld6 = 471.95950770616673;
    fb1 = lb2 || lb5;
if(fo1 != null){
      fo1.m3(ld6, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, ld4, ld6, fd0);
}
    Output.points[5][3] -= fd1;
    boolean lb7 = false;
    ld0 = ld3 + ld4;
    lb7 = ld6 > fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb2, lb5);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao2.m1();
}
    lb0 = !fb0;
    Thought lo1 = Thought44.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
    lb0 = !lb2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
    lb2 = fd1 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
    lb2 = ad3 < ad4;
    lb3 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
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
    ab1 = fd0 < fd1;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb0, ab1);
}
    double ld1 = 580.6493206159266;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, lb3, ab1, ab2, ab3);
}
    fd1 = ld1 + fd0;
    boolean lb4 = false;
    fd1 = ld1 + fd0;
    double ld5 = 890.9345823413847;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    ld1 = ld5 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ld1 *= -1;
    double ld6 = 51.37512368447883;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld5, ld6, fd0, fd1, fb1, lb0, lb2, lb3);
}
    double ld7 = 399.9156899495461;
    lb4 = !ab1;

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
    Output.points[5][4] -= ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      ab1 = fo1.m2(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
        ad2 = ad3 - ad4;
    Thought lo0 = Thought13.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m2();
}
    if (ab1) {
        boolean lb1 = true;
        fd0 = fd1 + ad1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || ab1;
if(ao1 != null){
          ao1.m3(fd0, fd1, ad1, ad2);
}
        boolean lb2 = true;
        boolean lb3 = true;
        double ld4 = 765.3111253630932;
        Thought lo5 = Thought70.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
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
    double ld0 = 824.8190440316631;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo1 = Thought27.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    double ld3 = 960.6265771393316;
    fd0 = fd1 - ld0;
    fb0 = ld3 > fd0;
    Output.points[5][5] += fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld4 = 785.1895156157278;
    fb1 = ld3 < ld4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    boolean lb5 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, fd0, fd1);
}
    fb0 = fb1 || lb2;
    lb5 = fb0 || fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][6] += fd0;
    Thought lo0 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3();
}
        if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought33.getInstance(fd0, fd1, fd0, fd1);
        Thought lo4 = Thought93.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        lb1 = !ab1;
if(fo0 != null){
          fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
        } else {
        Output.points[5][7] += fd1;
        boolean lb5 = false;
        fd0 *= -1;
        boolean lb6 = true;
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb5);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[5][8] -= fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb6, lb1, ab1, ab2);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 961.9242634882194;
    double ld1 = 143.7746670628862;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
        ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    double ld2 = 821.5541244431486;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
    ld1 = ld2 + ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, ld2, ad1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;

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
if(fo1 != null){
      fo1.m2();
}
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    ab4 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought16.getInstance(fd0, fd1, ad1, ad2);
    ad3 *= -1;
    ab1 = !ab2;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb2 = ad2 > ad3;
    Thought lo3 = Thought4.getInstance(fo1, fo0, fo1, fo0);
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 - fd1;
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        lb0 = !fb0;
        Thought lo1 = Thought62.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
        lb0 = fb0 && fb1;
        double ld2 = 302.7298002674168;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
        lb0 = !fb0;
        double ld3 = 948.699968608659;
        fb1 = ld3 < fd0;
        double ld4 = 101.93479331215848;
if(ao1 != null){
          fo1 = ao1.m4(lb0, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Thought lo0 = Thought72.getInstance();
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 - ad3;
    Output.points[6][0] += ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb1 = !ab1;
    fd0 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 929.8176175663543;
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    fd1 = ld1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3(lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought36.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 && fb0;
    Thought lo4 = Thought64.getInstance(fo0, fo1, fo0, fo1);
    ld1 = fd0 + fd1;
        ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
    fb1 = fd0 > fd1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    ld1 = fd0 - fd1;
    Output.points[6][1] += ld1;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3();
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
    Thought lo0 = Thought17.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    Thought lo1 = Thought40.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    double ld3 = 146.37945626725758;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, lb4, lb5, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1);
}
    boolean lb6 = true;
    ld3 *= -1;
    Thought lo7 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
    ab1 = ab2 || ab3;
    boolean lb8 = true;

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
    fb1 = ad1 < ad2;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    Output.points[6][2] -= ad3;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought20.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fd0 = fd1 + ad1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    Thought lo3 = Thought58.getInstance(fd0, fd1, ad1, ad2);
    boolean lb4 = false;
    Thought lo5 = Thought7.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    Thought lo6 = Thought80.getInstance(lb2, lb4, fb0, fb1);
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb7 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 161.77402347289183;
    if (fb0) {
        ld0 = ad1 + ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
        double ld1 = 225.2149279793617;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld0);
}
        Thought lo2 = Thought23.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ab1 || ab2;
if(fo0 != null){
          ad1 = fo0.m3();
}
        double ld3 = 754.6407370089806;
        double ld4 = 395.6953436335465;
        ld0 *= -1;
        boolean lb5 = true;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ld1;
        fb1 = lb5 || ab1;
        ld3 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb6 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 199.34431871374366;
    boolean lb1 = true;
    Output.points[6][3] += fd0;
    boolean lb2 = false;
    double ld3 = 97.44545663134143;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld3, fd0, lb1, lb2, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
}
    double ld4 = 180.73837016443844;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld3, ld4, fd0);
}
    Thought lo5 = Thought1.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ld3, ld4);
    double ld6 = 971.8134726747991;
    Thought lo7 = Thought27.getInstance(lb1, lb2, fb0, fb1);
if(fo0 != null){
      ld6 = fo0.m3();
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld3, ld4, ld6, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    boolean lb8 = false;
    fd1 = ld0 - ld3;
    lb1 = ld4 < ld6;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb9 = false;
    fd0 = fd1 - ld0;
    double ld10 = 679.0950629696256;

Thought.STACK_COUNTER++;
return ld3;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought7.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought37.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    Thought lo2 = Thought91.getInstance(fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    lb3 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    Output.points[6][4] -= ad3;
    ad4 *= -1;
    Thought lo4 = Thought35.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb3, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][5] += fd0;
        fb1 = ab1 && ab2;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        double ld0 = 38.1645878765509;
        fd0 = fd1 + ld0;
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
        ld0 = fd0 + fd1;
        Thought lo2 = Thought61.getInstance(ab2, ab3, ab4, fb0);
        ld0 = fd0 - fd1;
if(ao1 != null){
          ao1.m3();
}
        fb1 = ld0 < fd0;
        lb1 = ab1 && ab2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    double ld0 = 973.0364252851141;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought0.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb3, lb4, ab1);
}
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb5 = true;

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
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
        fb0 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
        Output.points[6][6] -= fd1;
if(fo0 != null){
          fo0.m3();
}
        double ld0 = 626.4033198419066;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld0 = 233.54954802711;
    fd0 = fd1 - ld0;
    double ld1 = 176.66438766475667;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
    ld1 = fd0 + fd1;
    boolean lb5 = false;
    ld0 *= -1;
    ld1 *= -1;
    lb3 = lb4 || lb5;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld6 = 649.564834488517;
    ld6 *= -1;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
        fb1 = !lb2;
    double ld7 = 298.41082789015417;

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
        ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        ad4 *= -1;
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    for(int i1=0; i1<10; i1++){
        boolean lb0 = false;
        lb0 = fb0 || fb1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
        lb0 = fb0 && fb1;
if(fo1 != null){
          lb0 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - ad1;
        lb0 = fb0 && fb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][7] -= ad2;
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
        ab1 = ad3 < ad4;
        boolean lb0 = true;
if(fo0 != null){
          fo0.m2(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        double ld1 = 796.1837654604826;
        Output.points[6][8] += fd0;
        boolean lb2 = true;
        boolean lb3 = true;
        Output.points[7][0] -= fd1;
        lb2 = ld1 < ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(lb3, ab1, ab2, ab3);
}
        fd1 = ld1 - ad1;
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
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought33.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    Thought lo1 = Thought92.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao2 != null){
      ao2.m2();
}
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
        fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
        double ld0 = 55.031100373680424;
        ad2 = ad3 - ad4;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
        } else {
        double ld1 = 417.350861599695;
        fb0 = ad3 < ad4;
        boolean lb2 = false;
        fd0 = fd1 - ld1;
        fb0 = fb1 && lb2;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 *= -1;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    if (ab3) {
if(ao1 != null){
          ao1.m1(ab4, fb0, fb1, lb0);
}
        ab1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo1 = Thought98.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 *= -1;
        double ld2 = 453.2796654580414;
        double ld3 = 615.2610171710506;
        fb1 = ld2 < ld3;
        boolean lb4 = false;
        fd0 = fd1 - ld2;
        ld3 = fd0 + fd1;
        ld2 = ld3 - fd0;
        fd1 = ld2 + ld3;
        double ld5 = 479.21264750752005;
        ld5 = fd0 + fd1;
}
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
        ab1 = ab2 || ab3;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 983.5387015314591;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fd0, fd1, ld0, ad1);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        for(int i0=0; i0<10; i0++){
            fb1 = !ab1;
            Output.points[7][1] += ld0;
if(ao1 != null){
              ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
              fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
            fb1 = ab1 && ab2;
            boolean lb1 = false;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
}
            ab3 = ab4 || fb0;
            boolean lb2 = true;
if(ao1 != null){
              fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
            ad1 *= -1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
            boolean lb3 = true;
            fd1 *= -1;
}}
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
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][2] += fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld0 = 172.22830183271952;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 114.25353502178643;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 352.2152802321546;
    lb0 = ld1 > fd0;
    fb0 = fb1 || lb0;
        boolean lb2 = false;
    Thought lo3 = Thought24.getInstance(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb0);
        Thought lo4 = Thought99.getInstance(fo0, fo1, fo0, fo1);
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
        lb2 = !fb0;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
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
