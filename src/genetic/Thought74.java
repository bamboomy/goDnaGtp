package genetic;
import java.util.ArrayList;
class Thought74 extends Thought{
private static ArrayList<Thought74> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 817.3491077471701;
private double fd1 = 332.802956950781;
private Thought fo0 = null;
private Thought fo1 = null;
Thought74 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought74 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought74 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 869.6465818886309;
    if (fb1) {
        fb0 = !fb1;
        } else if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        ld0 *= -1;
        Output.points[7][2] -= fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
          ld0 = fo0.m3();
}
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fd1 = ld0 - fd0;
        double ld1 = 310.59298562617545;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld2 = 586.2206056083993;
        ld0 *= -1;
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
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[7][3] -= fd1;
    lb1 = fd0 < fd1;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    ab4 = fd1 < fd0;
    double ld3 = 171.37976336864028;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 681.8586572740113;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld3 = 909.5191494076432;
    fb0 = fb1 || lb1;
    ad4 *= -1;
    lb2 = fd0 < fd1;
    fb0 = ld0 > ld3;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    if (fb0) {
        Output.points[7][4] += fd0;
        double ld5 = 324.7149348736171;
        Output.points[7][5] += fd0;
        fd1 *= -1;
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
    Thought lo0 = Thought269.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        boolean lb1 = false;
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
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    double ld1 = 692.3849032680812;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    double ld3 = 474.1395269510688;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, lb2, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld3, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;

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
    Output.points[7][6] += ad1;
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, fb0);
}
    if (fb1) {
        Thought lo1 = Thought390.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        boolean lb2 = false;
        ad4 *= -1;
        if (lb0) {
if(ao2 != null){
              fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb2, lb0, fb0);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, lb2, lb0, fb0);
}
            double ld3 = 279.8651346741252;
            fb1 = ad2 < ad3;
            ad4 *= -1;
if(ao3 != null){
              ao2 = ao3.m4(lb2, lb0, fb0, fb1);
}
            for(int i0=0; i0<10; i0++){
                lb2 = fd0 > fd1;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
                double ld4 = 797.3607371259185;
                boolean lb5 = true;
}}}
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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab2 = ao2.m2(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought126.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    ab2 = !ab3;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    Output.points[7][7] -= fd1;
    lb2 = fd0 < fd1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    lb2 = !ab1;
    double ld3 = 569.1276126070627;
    ab2 = ab3 && ab4;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb1, lb2);
}
    Thought lo4 = Thought123.getInstance(ao4, fo0, fo1, ao1);
    fd1 = ld3 - fd0;

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
    ab1 = ad1 > ad2;
if(ao2 != null){
      ab2 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ab3 = ad4 < fd0;
    Thought lo0 = Thought275.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld1 = 770.3855444413524;
    Thought lo2 = Thought275.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[7][8] += ld1;
    Thought lo3 = Thought221.getInstance();
    boolean lb4 = true;
    Thought lo5 = Thought122.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb4, ab1);
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb4, ab1);
}
    fd1 = ld1 + ad1;
    ad2 = ad3 + ad4;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb6 = true;
    ld1 = ad1 + ad2;
    ab2 = !ab3;
    ad3 = ad4 + fd0;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld0 = 245.39762425897987;
    ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;

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
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo0 = Thought32.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought55.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    Output.points[8][0] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[8][1] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fb0 = !fb1;
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    Thought lo0 = Thought185.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
    ab3 = ad1 < ad2;
    double ld3 = 709.3587064587656;
    ab4 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld3, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    Thought lo0 = Thought201.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = !fb1;
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    Output.points[8][2] += ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought358.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[8][3] -= ad1;
    Thought lo1 = Thought138.getInstance(ad2, ad3, ad4, fd0);
    boolean lb2 = false;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Output.points[8][4] += fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo0 = Thought190.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 42.1350200778636;
    Output.points[8][5] += fd0;
    double ld2 = 567.7253775775316;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, ld2, fd0);
}
    fd1 = ld1 + ld2;
    fd0 = fd1 + ld1;
    ld2 = fd0 + fd1;

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
    Thought lo0 = Thought47.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    Output.points[8][6] -= fd1;
    double ld1 = 989.4521934847802;
    ld1 = ad1 - ad2;
    ab1 = ad3 < ad4;
    boolean lb2 = false;
    ab1 = !ab2;
    Thought lo3 = Thought312.getInstance(fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
    lb2 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
        lb2 = ab1 || ab2;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2, fb1, lb2, ab1, ab2);
}
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
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
    double ld0 = 849.0287917222334;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][7] -= fd0;
    lb1 = fd1 < ld0;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought150.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;

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
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought20.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fd0 = fo1.m3();
}
    fb1 = !ab1;
    ab2 = fd1 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    fb1 = lb1 || ab1;
    Thought lo2 = Thought311.getInstance(fd0, fd1, fd0, fd1);
    ab2 = !ab3;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
        Output.points[8][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld6 = 351.44443717909775;

Thought.STACK_COUNTER++;
return ld6;
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
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    Thought lo1 = Thought47.getInstance();
    boolean lb2 = false;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    double ld3 = 456.6006870877285;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld6 = 205.68862305135772;
    Output.points[0][0] += ad3;
    lb2 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, ld6, ad1);
}
    lb4 = ad2 < ad3;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought337.getInstance(lb0, fb0, fb1, lb0);
    Output.points[0][1] += fd1;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    if (fb0) {
        Output.points[0][2] -= fd1;
        double ld2 = 972.0528470167502;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
        fd1 = ld2 + fd0;
        fd1 = ld2 + fd0;
        fd1 = ld2 - fd0;
        fb1 = lb0 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
        fb1 = !lb0;
        boolean lb3 = true;
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
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[0][3] += ad1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m3();
}
    ad3 *= -1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
        boolean lb1 = false;
        double ld2 = 42.20481404161513;
if(ao4 != null){
          ao4.m3(ad3, ad4, fd0, fd1, lb1, lb0, fb0, fb1);
}
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
}
        double ld3 = 421.5803156639323;
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
      ao2.m1();
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao3.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
        ab1 = fd1 > fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        Output.points[0][4] -= fd0;
        Output.points[0][5] += fd1;
        fb0 = fb1 && ab1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m1(ab4, fb0, fb1, ab1);
}
        fd0 = fd1 - fd0;
        ab2 = !ab3;
        Thought lo0 = Thought154.getInstance(fo1, ao1, ao2, ao3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought120.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    Thought lo1 = Thought282.getInstance();
    boolean lb2 = true;
    Thought lo3 = Thought68.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb2, ab1);
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    if (ab1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        double ld5 = 610.2615843176524;
        ab2 = fd0 > fd1;
        if (ab3) {
            double ld6 = 289.32877900460454;
}}
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
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought233.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[0][7] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought325.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
        Output.points[0][8] -= fd1;
    fb0 = fb1 && lb2;
    boolean lb3 = false;
        fd0 = fd1 - fd0;
    double ld4 = 243.47971829318274;
    Thought lo5 = Thought9.getInstance(lb3, fb0, fb1, lb2);

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
    ab2 = !ab3;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    Thought lo0 = Thought164.getInstance(fb1, fb0, fb1, fb0);
    Output.points[1][0] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[1][1] += ad1;
    ad2 = ad3 + ad4;
    double ld1 = 893.1744587915604;
    ad4 = fd0 + fd1;
    fb1 = ld1 > ad1;
    fb0 = fb1 || fb0;
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought322.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
    ad1 *= -1;
    ab1 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    fb1 = ab1 || ab2;
    ad3 = ad4 + fd0;
    double ld0 = 921.8170219163874;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 - ad2;
    Output.points[1][2] -= ad3;
    double ld1 = 768.0990231925737;
    ad3 = ad4 - fd0;
    fd1 = ld0 + ld1;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, ab1);
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
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[1][3] += fd0;
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought308.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought213.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
    lb1 = fd1 > fd0;
    Thought lo3 = Thought211.getInstance();

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    ad1 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    Output.points[1][4] -= ad2;
if(ao2 != null){
      ao2.m2(lb0, lb1, lb2, lb3);
}
    Output.points[1][5] += ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = ad1 > ad2;
    lb3 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb3 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb1, lb2, lb3, fb0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb1, lb2);
}
    lb3 = ad3 < ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 401.2396324890205;
    Output.points[1][6] -= fd0;
    double ld1 = 734.8078660537673;
        Thought lo2 = Thought256.getInstance(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb3;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0);
}
    if (ab1) {
        ld1 *= -1;
        ab2 = ab3 || ab4;
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
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    boolean lb1 = false;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = ad3 < ad4;
    double ld2 = 323.561223104731;
    if (lb1) {
        ab1 = ad4 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought253.getInstance();
        boolean lb4 = true;
        Output.points[1][7] += fd1;
        boolean lb5 = true;
        ld2 = ad1 + ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb4);
}
        Thought lo6 = Thought238.getInstance(lb5, lb0, lb1, ab1);
        Output.points[1][8] -= ld2;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb4;
        ad1 = ad2 - ad3;
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
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 726.3045760505851;
    fd0 = fd1 - ld0;
    double ld1 = 757.232395236728;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    Thought lo2 = Thought28.getInstance();
    double ld3 = 239.36907808573463;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1, lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb4, fb0, fb1);
}
    Output.points[2][0] -= ld0;

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
    fb0 = fd1 < fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 232.92619285337275;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fb0 = fd1 > ld0;
    fd0 = fd1 - ld0;
    double ld1 = 721.1026440760197;
    fb1 = ld1 > fd0;
    double ld2 = 217.91692901545892;
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld0;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    double ld5 = 439.39492128009;
    Thought lo6 = Thought144.getInstance(ld0, ld1, ld2, ld5, lb4, fb0, fb1, lb3);
    boolean lb7 = true;
    boolean lb8 = true;
    lb4 = !lb7;
    fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb8, fb0, fb1, lb3);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought118.getInstance(fo1, fo0, fo1, fo0);
    lb1 = fd0 > fd1;
    Thought lo3 = Thought57.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = lb0 || lb1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo4 = Thought271.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    boolean lb5 = true;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;

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
