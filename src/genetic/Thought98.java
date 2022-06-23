package genetic;
import java.util.ArrayList;
class Thought98 extends Thought{
private static ArrayList<Thought98> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 92.89704239455588;
private double fd1 = 732.8576272098229;
private Thought fo0 = null;
private Thought fo1 = null;
Thought98 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought98 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought98 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        Output.points[4][7] -= fd0;
        Output.points[4][8] += fd1;
        boolean lb0 = false;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        double ld2 = 534.4260960527167;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
        boolean lb3 = true;
        fb0 = fd0 < fd1;
        boolean lb4 = false;
        Thought lo5 = Thought52.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    boolean lb2 = false;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[5][0] -= fd1;
    fd0 = fd1 + fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld4 = 527.8316329247343;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
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
    double ld0 = 841.2619218244706;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 || fb1;
    Thought lo1 = Thought68.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fo1.m2(ad2, ad3, ad4, fd0);
}
            double ld2 = 862.9973442031334;
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    double ld1 = 341.68444783282257;
    boolean lb2 = true;
    lb0 = !lb2;
    ab1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = ad4 < fd0;
    lb0 = fd1 > ld1;
    Output.points[5][1] -= ad1;
    Output.points[5][2] -= ad2;
        lb2 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = ad1 - ad2;
    lb0 = ad3 < ad4;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought16.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    if (fb1) {
        boolean lb1 = true;
        lb1 = !fb0;
if(ao2 != null){
          fb1 = ao2.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
        Thought lo2 = Thought84.getInstance(ao3, ao4, fo0, fo1);
        fb0 = fd1 < fd0;
        fb1 = fd1 < fd0;
        lb1 = fb0 && fb1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb1 = fb0 || fb1;
        double ld3 = 827.0949854849101;
        lb1 = fd0 > fd1;
        ld3 *= -1;
        fd0 = fd1 - ld3;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][3] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m1(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    Thought lo2 = Thought77.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Output.points[5][4] -= fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        Thought lo1 = Thought86.getInstance(fb1, lb0, ab1, ab2);
        double ld2 = 33.00881738509537;
        Output.points[5][5] += fd0;
        fd1 = ld2 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    Output.points[5][6] += ad1;
    ab4 = !fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo0 = Thought77.getInstance(ad2, ad3, ad4, fd0);

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought50.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 2.045178192144507;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fd0 > fd1;
        fb0 = ld1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        boolean lb3 = false;
        Thought lo4 = Thought57.getInstance(fd1, fd0, fd1, fd0);
        lb1 = ab1 && ab2;
        Thought lo5 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        fd1 *= -1;
        ab3 = fd0 > fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought91.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
    Output.points[5][7] += ad2;
    boolean lb1 = true;
    if (fb0) {
        fb1 = ad3 > ad4;
        lb1 = fb0 || fb1;
        lb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m1();
}
        fb0 = ad1 > ad2;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
            fd0 = fd1 - ad1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
            fb1 = ad2 < ad3;
            for(int i0=0; i0<10; i0++){
if(fo1 != null){
                  fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
                boolean lb2 = true;
if(fo0 != null){
                  ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
                  fo1 = fo0.m4(lb2, lb1, fb0, fb1);
}
                lb2 = lb1 && fb0;
                double ld3 = 631.6771917906035;
                boolean lb4 = true;
                ld3 = ad1 - ad2;
                ad3 *= -1;
}}}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought45.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    double ld3 = 96.35416776979181;
    ab2 = !ab3;
    double ld4 = 778.5315083579585;
    ld4 = ad1 + ad2;
    if (ab4) {
        double ld5 = 485.5486055514193;
        fb0 = ad2 < ad3;
        boolean lb6 = true;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld5, ld3);
}
        fb0 = ld4 < ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 759.0313476081794;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 948.9310301653042;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = ld1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
        boolean lb3 = true;
    ld0 = ld1 + fd0;
    boolean lb4 = true;
    lb2 = lb3 && lb4;
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = ad2 > ad3;
    Thought lo1 = Thought40.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    lb0 = !fb0;
    ad3 = ad4 + fd0;
        Thought lo2 = Thought17.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    lb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
    double ld3 = 934.0592650048927;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;

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
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        Thought lo1 = Thought16.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld2 = 588.1942127077892;
if(ao4 != null){
          ao4.m3(fd0, fd1, ld2, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 > ld2;
        double ld3 = 168.63869837143545;
        Thought lo4 = Thought84.getInstance(fo0, fo1, ao1, ao2);
        ld3 = fd0 - fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld0 = 432.46762893098503;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought99.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = !ab1;
    ab2 = fd1 > ld0;
    ab3 = !ab4;
    Output.points[5][8] += ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || ab1;
    boolean lb2 = false;

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
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought71.getInstance();
    Thought lo1 = Thought71.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
        Output.points[6][0] -= fd0;
    Output.points[6][1] += fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 594.634050700848;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld3;

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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought89.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo2 = Thought68.getInstance(ab4, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought20.getInstance(fo1, fo0, fo1, fo0);
    double ld4 = 438.10193106544875;
    fb0 = fd0 > fd1;
    fb1 = lb0 && ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, fb0, fb1, lb0, ab1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    if (lb0) {
        lb1 = lb2 && fb0;
        boolean lb3 = true;
        boolean lb4 = false;
if(fo0 != null){
          fd1 = fo0.m3(lb2, fb0, fb1, lb3);
}
if(fo1 != null){
          fo1.m1();
}
        lb4 = ad1 < ad2;
        boolean lb5 = true;
        lb5 = lb0 || lb1;
        lb2 = fb0 && fb1;
        boolean lb6 = false;
        Output.points[6][2] += ad3;
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ad1, lb3, lb4, lb5, lb6);
}
        lb0 = !lb1;
        ad2 = ad3 - ad4;
        lb2 = fb0 && fb1;
        fd0 *= -1;
        lb3 = lb4 || lb5;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb6 = !lb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ad4 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    double ld0 = 422.62762306712267;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
    Output.points[6][3] += fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought72.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 652.084057536819;
        fd0 = fd1 - ld1;
        fb1 = !fb0;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2();
}
if(ao4 != null){
          ao4.m1(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought91.getInstance(ad1, ad2, ad3, ad4);
    lb0 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        lb0 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
        fd1 = ad1 + ad2;
        ad3 *= -1;
        }
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    lb2 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
    if (lb3) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb0 = fb1 || lb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought97.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        double ld1 = 287.56364407273577;
        fb0 = !fb1;
        }
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought66.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld4 = 506.42285148796765;
    lb2 = fd0 > fd1;
    Thought lo5 = Thought50.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ld4 < fd0;

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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    lb0 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = ad2 > ad3;
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought99.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    lb1 = lb2 && ab1;
    fd1 = ad1 + ad2;
    boolean lb4 = true;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ad3 = ao3.m3(ab4, fb0, fb1, lb0);
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
    fb1 = !fb0;
    double ld0 = 14.434635904128204;
    fb1 = !fb0;
    if (fb1) {
        Output.points[6][4] -= ld0;
        } else {
        Thought lo1 = Thought99.getInstance();
if(fo1 != null){
                  fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = fd0 - fd1;
        ld0 *= -1;
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
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    if (ab1) {
        ab2 = !ab3;
        double ld1 = 634.1880550691898;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab4 = fb0 || fb1;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, lb0, ab1, ab2);
}
        ab3 = fd1 < ld1;
        ab4 = fd0 < fd1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb0);
}
        Thought lo3 = Thought84.getInstance(fd0, fd1, ld1, fd0);
        double ld4 = 92.58338881968733;
        fd0 *= -1;
        } else if (ab2) {
        } else if (ab3) {
        Thought lo5 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb6 = false;
        ab4 = fd1 < fd0;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad2 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = ad1 > ad2;
    double ld2 = 944.6474467470412;
    lb1 = !fb0;
    double ld3 = 464.36774126320057;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    Output.points[6][5] -= ld2;
    Thought lo4 = Thought95.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
    lb0 = ad4 > fd0;
    double ld5 = 671.4834360006942;
    lb1 = fd0 < fd1;

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
    ab1 = ab2 && ab3;
    double ld0 = 309.48364178393484;
    Thought lo1 = Thought6.getInstance(ab4, fb0, fb1, ab1);
    Output.points[6][6] += ld0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld2 = 521.5537221276254;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(ld0, ld2, ad1, ad2, fb0, fb1, ab1, ab2);
}
    double ld3 = 196.27051311261286;
    Thought lo4 = Thought39.getInstance(fo0, fo1, fo0, fo1);
    ad2 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb5 = false;
    Thought lo6 = Thought97.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ld0 = fo0.m3(ld2, ld3, ad1, ad2);
}
    double ld7 = 316.5269475830026;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb5 = !ab1;
    ab2 = fd1 > ld0;

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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 817.1593868988552;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[6][7] += fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;

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
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought67.getInstance(ad4, fd0, fd1, ad1);
    boolean lb1 = true;
    Output.points[6][8] += ad2;
    ad3 *= -1;
    lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
        Output.points[7][0] -= ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb1 = fb0 && fb1;
    double ld2 = 460.12672080064533;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = !ab3;
    boolean lb0 = false;
    fd0 *= -1;
if(ao4 != null){
          fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = !ab1;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        Thought lo3 = Thought93.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
        Thought lo4 = Thought27.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
        fd1 *= -1;
        double ld5 = 438.2771913931099;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought72.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad3 = ao1.m3(ab2, ab3, ab4, fb0);
}
        ad4 *= -1;
        fd0 = fd1 + ad1;
        for(int i1=0; i1<10; i1++){
if(ao3 != null){
              ao2 = ao3.m4();
}
if(fo0 != null){
              ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
}}
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
    double ld0 = 455.0585215727883;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    double ld2 = 646.1645054186645;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
    ld0 = ld2 + fd0;
    lb1 = !lb3;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, fd0);
}
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    Output.points[7][1] -= fd0;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb1);
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
    Output.points[7][2] += fd1;
    Output.points[7][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
        Output.points[7][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    double ld3 = 933.990159153556;
    double ld4 = 351.34474350067836;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m3(ld3, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1);
}
    boolean lb6 = false;
    ld3 = ld4 - fd0;
    fd1 = ld3 + ld4;
    boolean lb7 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, lb2, lb5);
}
    fd1 = ld3 - ld4;
    lb6 = !lb7;
    fd0 = fd1 - ld3;
if(fo0 != null){
      ld4 = fo0.m3();
}
    fd0 *= -1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought92.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fb0 = fd1 > fd0;

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
